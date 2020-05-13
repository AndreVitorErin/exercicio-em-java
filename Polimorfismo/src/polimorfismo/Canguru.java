package polimorfismo;
public class Canguru extends Mamiferos{
    public void usarBolsa(){
        System.out.println("usando bolsa");        
    }
    @Override
    public void locomover(){
        System.out.println("pulando");
        
    }
    
}
