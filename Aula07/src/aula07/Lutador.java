package aula07;
public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //métodos especiais
    public Lutador(String no, String na, int id, float alt, float pe, int vit, int der, int emp) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = alt;
        this.setPeso(pe);
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;
    }

    

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
        
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Invalido";
        }else if (this.peso <= 70.3){
            this.categoria = "Leve";
        }else if (this.peso <= 83.9 ){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
            
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    //métodos complementares
    public void apresentar(){
        System.out.println("__________________________________________________________");
        System.out.println("Chegou a hora! Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos");
        System.out.println("Pesando " + this.getPeso() + " Kg, é da categoria " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " lutas");
        System.out.println("Perder " + this.getDerrotas());
        System.out.println("E empatou " + this.getEmpates());
    }
    
    public void status (){
        System.out.println("___________________________________________________________");
        System.out.println(this.getNome() + ", ");
        System.out.print("de " + this.getIdade() + ", é da categoria " + this.getCategoria() + ".");
        System.out.println("\nPossui " + this.getVitorias() + " vitória(s), " + this.getDerrotas() + " derrota(s) e "
        + this.getEmpates() + " empate(s)");  
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);      
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    
}
