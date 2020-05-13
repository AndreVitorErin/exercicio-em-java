package exercicioheranca;
public class Aluno extends Pessoa{
    //atributos
    private String curso;
    private int matricula;
    
    //métodos públicos
    public void cancelarMatricula(){
        System.out.println("Matrícula cancelada");
    }
    
    //metodos especiais

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
