package Model;

public class Contato {
    // Atributos
    private int codContato;
    private String nome;
    private String telCelular;
    private String telFixo;
    private String email;

    // Acessores
    public int getCodContato() {
        return codContato;
    }
    public void setCodContato(int codContato) {
        this.codContato = codContato;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelCelular() {
        return telCelular;
    }
    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }
    public String getTelFixo() {
        return telFixo;
    }
    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Construtor
    public Contato() {

    }

    // Métodos

    // toString
    @Override
    public String toString() {
        return  "\n-----------------------------------" +
                "\nCódigo do Contato: " + codContato +
                "\nNome: " + nome +
                "\nTelefone (Celular): " + telCelular +
                "\nTelefone (Fixo): " + telFixo +
                "\nEmail: " + email +
                "\n";
    }
}
