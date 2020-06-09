package Model;

import java.util.ArrayList;

public class Agenda {
    // Atributos
    private ArrayList<Contato> lista;

    // Acessores
    public ArrayList<Contato> getLista() {
        return lista;
    }
    public void setLista(ArrayList<Contato> lista) {
        this.lista = lista;
    }

    // Construtor
    public Agenda() {
        this.lista = new ArrayList<>();
    }

    // Métodos
    public void cadastrar(Contato c1) {
        this.lista.add(c1);
    }
    public void excluir(Contato c1) {
        this.lista.remove(c1);
    }
    public int verQuantidade() {
        return this.lista.size();
    }
    public Contato pesquisar(int codigo) {
        Contato achei = null;

        for (int i=0; i<this.lista.size(); i++) {
            if (this.lista.get(i).getCodContato() == codigo){
                achei = this.lista.get(i);
            }
        }

        return achei;
    }
    public Contato pesquisarCelular(String celular) {
        Contato achei = null;

        for (int i=0; i<this.lista.size(); i++) {
            if (this.lista.get(i).getTelCelular().equals(celular)){
                achei = this.lista.get(i);
            }
        }

        return achei;
    }

    // toString
    @Override
    public String toString() {
        return "Lista de Contatos: \n" + this.lista;
    }
}
