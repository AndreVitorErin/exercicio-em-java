package projetopoo;
public class ProjetoPOO {
    public static void main(String[] args) {
        
        Video v [];
        v = new Video [3];
        
        v[0] = new Video ("aula 01 POO");
        v[1] = new Video ("Aula 10 PHP");
        v[2] = new Video ("Aula 06 HTML5");
        
        Gafanhoto g [];
        g = new Gafanhoto [2];
        
        g [0] = new Gafanhoto ("André","masculino", 31, "andre_vitor");
        g [1] = new Gafanhoto ("Ariel", "agenero", 25, "ariel123");
        
        Visualizacao x [];
        x = new Visualizacao [3];
        
        x[0] = new Visualizacao (g[0],v[0]);
        x[0].avaliar();
        x[1] = new Visualizacao (g[0],v[1]);
        x[1].avaliar(95.0f);
       
        System.out.println(x[0].toString());
        System.out.println(x[1].toString());
        
        
    }
    
}
