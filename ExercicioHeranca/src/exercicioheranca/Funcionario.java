package exercicioheranca;
public class Funcionario extends Pessoa {
    //atributos
    private String setor;
    private boolean trabalhando;
    
    //métodos públicos
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }
    
    //métodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
