package exercicioheranca;
public class Professor extends Pessoa {
    //atibutos
    private String especialidade;
    private float salario;
    
    //métodos públicos
    public void receberAumento(){
        this.setSalario(this.getSalario()+1);
    
}
    
    //métodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
