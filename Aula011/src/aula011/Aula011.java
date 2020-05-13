package aula011;
public class Aula011 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setSexo("masculino");
        v1.setIdade(25);
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno ();
        a1.setNome("Gabriel");
        a1.setCurso("informática");
        a1.setSexo("genero neutro");
        a1.setIdade(35);
        a1.setMatricula(555486);
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setNome("João");
        b1.setMatricula(69993);
        b1.setBolsa(12.7f);
        b1.setSexo("masculino");
        b1.setIdade(26);
        b1.renovarBolsa();
        b1.pagarMensalidade();
        System.out.println(b1.toString());
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Juliana");
        t1.setSexo("feminino");
        t1.setMatricula(565478);
        t1.setIdade(19);
        System.out.println(t1.toString());
        
        Professor p1 = new Professor();
        p1.setNome("Juan");
        p1.setIdade(42);
        p1.setSexo("agênero");
        p1.setEspecialidade("Espanhol");
        p1.setSalario(5000);
        p1.receberAumento(1000);
        System.out.println(p1.getSalario());
    }
    
}
