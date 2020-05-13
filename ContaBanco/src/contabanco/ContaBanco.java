package contabanco;
public class ContaBanco {
    public static void main(String[] args) {
        
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("cc");
        
        Conta p2 = new Conta();
        p2.setNumConta (2222);
        p2.setDono("Creusa");
        p2.abrirConta("cp");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(1000);
        
        p1.sacar(150);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();

    }
    
}
