package projetopoo;
public class Gafanhoto extends Pessoa {
    private String login;
    private int assistido;

    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.assistido = 0;
    }
        

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAssistido() {
        return assistido;
    }

    public void setAssistido(int assistido) {
        this.assistido = assistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +super.toString() + "login=" + login + ", assistido=" + assistido + '}';
    }
    
    
    
}
