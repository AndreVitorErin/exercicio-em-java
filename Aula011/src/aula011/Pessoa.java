package aula011;
public abstract class Pessoa {
    //atributos
    private String nome, sexo;
    private int idade;
    
    //métodos públicos
    public void fazerAniversario(){
        this.idade = this.idade++;
    }
    
    //métodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Dado: {" + "nome = " + nome + ", sexo = " + sexo + ", idade = " + idade + '}';
    }
            
    
}
