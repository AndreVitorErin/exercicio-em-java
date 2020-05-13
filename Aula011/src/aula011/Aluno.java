package aula011;
public class Aluno extends Pessoa{
   //atributos
    private String curso;
    private int matricula;
    //métodos
    public void pagarMensalidade (){
        System.out.println("pagando mensalidade do aluno " + this.getNome());
    }

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
