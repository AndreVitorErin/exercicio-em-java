package exercicio;
public class Exercicio {
    public static void main(String[] args) {
        Pessoa p [] = new Pessoa [2];
        Livro l [] = new Livro [3];
        
        p[0] = new Pessoa ("André", 31, "masculino");
        p[1] = new Pessoa ("Maria", 23, "feminino");
        
        l[0] = new Livro ("Introdução ao Reike", "David Vernnells", 211, p[0]);
        l[1] = new Livro ("Aprendendo Java", "José Augusto", 361, p[0]);
        l[2] = new Livro ("Ética", "Espinosa", 450, p[1]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        l[0].fechar();
        
        System.out.println(l[0].detalhes());
       
    }
    
}
