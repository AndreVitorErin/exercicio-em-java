package exercicioheranca;
public class Pessoa {
    //Atributos
    private String nome, sexo;
    private int idade;
    
    //métodos público
    public void fazerAniversario(){
        this.idade ++;
    }
    
    //métodos especiais

    @Override
    public String toString() {
        return "Pessoa{" + "nome = " + nome + ", sexo = " + sexo + ", idade = " + idade + '}';
    }
    

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
    
}
