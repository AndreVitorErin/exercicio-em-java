package polimorfismo;
public class Reptil extends Animal {
    private String cordaescama;

    @Override
    public void locomover() {
        System.out.println("rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de réptil");
    }

    public String getCordaescama() {
        return cordaescama;
    }

    public void setCordaescama(String cordaescama) {
        this.cordaescama = cordaescama;
    }
    
    
    
}
