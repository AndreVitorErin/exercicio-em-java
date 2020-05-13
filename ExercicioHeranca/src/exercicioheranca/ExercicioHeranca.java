package exercicioheranca;
public class ExercicioHeranca {
    public static void main(String[] args) {
        // programa principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno ();
        Professor p3 = new Professor ();
        Funcionario p4 = new Funcionario ();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("masculino");
        p4.setSexo("feminino");
        p2.setIdade(18);
        p2.setCurso("informática");
        p3.setSalario(1789.50f);
        p4.setSetor("almoxarifado");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
