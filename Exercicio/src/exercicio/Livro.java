package exercicio;
public class Livro implements Publicacao{
    //atributos
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //métodos público

    public String detalhes() {
        return "Livro{" + "titulo = " + titulo + ", autor = " + autor + ", \ntotPaginas = " + totPaginas + 
                ", pagAtual = " + pagAtual + ", aberto = " + aberto + ", \nleitor = " + leitor.getNome() +
                ", idade = " + leitor.getIdade() + ", sexo = " + leitor.getSexo()+'}';
    }
    
    
    //métodos especiais

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //métodos abstratos

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
        this.pagAtual = 0;
    }

    @Override
    public void folhear(int p) {
        if (this.getAberto()&& p <= this.getTotPaginas()){
            this.pagAtual = p;
        }else{
            System.out.println("Não é possível ir até a página solciitada.\nVerifique se "
                    + "o livro está aberto ou se a página pedida é menor \ndo que a quantidade"
                    + "de páginas total do livro\n");
        }
        
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual()-1);
    }
    
    
}
