package polimorfismo;
public class Aves extends Animal{
    private String cordapena;

    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo minhoca");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de ave");
    }
    
    public void fazerNinho(){
        System.out.println("fazendo ninho");
    }

    public String getCordapena() {
        return cordapena;
    }

    public void setCordapena(String cordapena) {
        this.cordapena = cordapena;
    }
    
    
    
    
}
