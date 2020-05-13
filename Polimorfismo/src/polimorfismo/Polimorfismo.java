package polimorfismo;
public class Polimorfismo {
    public static void main(String[] args) {
        Mamiferos m1 = new Mamiferos();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Aves a1 = new Aves();
        Canguru c1 = new Canguru();
        Cachorro ca1 = new Cachorro();
        Cobra co1 = new Cobra();
        Tartaruga t1 = new Tartaruga();        
        PeixeDourado pd1 = new PeixeDourado();
        Arara ar1 = new Arara();        
                
                
        m1.setPeso(1.59f);
        m1.setCordopelo("marrom");
        m1.alimentar();
        m1.locomover();
        m1.emitirSom();
        
        r1.alimentar();
        r1.locomover();
        r1.emitirSom();
        
        p1.alimentar();
        p1.locomover();
        p1.emitirSom();
        
        a1.alimentar();
        a1.locomover();
        a1.emitirSom();
        
        c1.alimentar();
        c1.locomover();
        c1.emitirSom();
        c1.usarBolsa();
        
        ca1.alimentar();
        ca1.locomover();
        ca1.emitirSom();
        
        
        co1.alimentar();
        co1.locomover();
        co1.emitirSom();
        
        t1.alimentar();
        t1.locomover();
        t1.emitirSom();
        
        pd1.alimentar();
        pd1.locomover();
        pd1.emitirSom();
        
        ar1.alimentar();
        ar1.locomover();
        ar1.emitirSom();
    }
    
}
