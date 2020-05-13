package polimorfismo;
public class Peixe extends Animal {
    private String corescama;

    @Override
    public void locomover() {
        System.out.println("nadando");
    }
    
    @Override
    public void alimentar() {
        System.out.println("comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de peixe");
    }
    
    public void soltarBolha(){
        System.out.println("soltando bolhas");
    }

    public String getCorescama() {
        return corescama;
    }

    public void setCorescama(String corescama) {
        this.corescama = corescama;
    }
    
    
}
