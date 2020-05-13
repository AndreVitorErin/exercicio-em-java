package polimorfismo;
public class Mamiferos extends Animal {
    private String cordopelo;
    

    @Override
    public void locomover() {
        System.out.println("correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de mamífero");
    }

    public String getCordopelo() {
        return cordopelo;
    }

    public void setCordopelo(String cordopelo) {
        this.cordopelo = cordopelo;
    }
    
    
    
}
