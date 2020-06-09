package View;

import Model.Agenda;
import Model.Contato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // stdin
        Scanner stdin = new Scanner(System.in);

        // Lista principal
        Agenda a1 = new Agenda();

        System.out.println("Pressione enter pra continuar...");
        stdin.nextLine();

        // Menu
        byte menu;
        do {
            System.out.println("1- Cadastre contato\n" +
                    "2- Ver contatos\n" +
                    "3- Ver Quantidade de Contatos cadastrados\n" +
                    "4- Remover um contato\n" +
                    "5- Pesquisar Contato pelo telefone celular\n" +
                    "0- Sair");

            menu = stdin.nextByte();

            switch (menu) {
                case 1:
                    System.out.println("CADASTRANDO...");

                    Contato c1 = new Contato();

                    System.out.print("Digite o código do contato: ");
                    c1.setCodContato(stdin.nextInt());
                    System.out.print("Digite o nome: ");
                    c1.setNome(stdin.nextLine());
                    System.out.print("Digite o telefone celular: ");
                    c1.setTelCelular(stdin.nextLine());
                    System.out.print("Digite o telefone fixo: ");
                    c1.setTelFixo(stdin.nextLine());
                    System.out.print("Digite o email: ");
                    c1.setEmail(stdin.nextLine());

                    a1.cadastrar(c1);

                    break;
                case 2:
                    System.out.println("CONTATOS");

                    if(a1.getLista().isEmpty()) {
                        System.out.println("Não há contatos cadastrados!");
                    } else {
                        System.out.println(a1);
                    }

                    break;
                case 3:
                    System.out.println("NÚMERO DE CONTATOS");

                    if(a1.getLista().isEmpty()) {
                        System.out.println("Não há contatos cadastrados!");
                    } else {
                        System.out.println("Há " + a1.verQuantidade() + " contatos cadastrados");
                    }

                    break;
                case 4:
                    System.out.println("EXCLUINDO...");

                    if (!(a1.getLista().isEmpty())) {
                        System.out.println("Digite o código do contato: ");

                        int codigo = stdin.nextInt();
                        Contato encontrado = a1.pesquisar(codigo);

                        if (encontrado != null) {
                            System.out.println("Deseja cancelar?\n1-SIM\n2-NÂO");
                            byte opcao = stdin.nextByte();
                            if (opcao == 1) {
                                a1.excluir(encontrado);
                                System.out.println("Apagado!");
                            } else {
                                System.out.println("Operação cancelada!");
                            }
                        } else {
                            System.out.println("Não foi encontrado contatos com este código.");
                        }
                    } else {
                        System.out.println("Não há contatos cadastrados!");
                    }
                    break;
                case 5:
                    System.out.println("PESQUISANDO");

                    if (!(a1.getLista().isEmpty())) {
                        System.out.println("Digite o celular do contato: ");

                        String celular = stdin.next();
                        Contato encontrado = a1.pesquisarCelular(celular);

                        if (encontrado != null) {
                            System.out.println("Contato encontrado!");
                            System.out.println(encontrado);

                        } else {
                            System.out.println("Não foi encontrado contatos com este celular.");
                        }
                    } else {
                        System.out.println("Não há contatos cadastrados!");
                    }

                case 0:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente!");
            }
        } while (menu != 0);

    }
}
