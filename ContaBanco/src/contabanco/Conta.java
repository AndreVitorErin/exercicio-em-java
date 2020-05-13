package contabanco;
public class Conta {
   //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("___________________________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo da Conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        
    }
    
    //metodos
    public Conta (){ // método construtor
       this.saldo = 0;
       this.status = false;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta (){
        return numConta;
    }
    public void setTipo (String t){
        this.tipo = t;
    }
    public String getTipo (){
        return tipo;
    }
    public void setDono (String d){
        this.dono = d;
    }
    public String getDono (){
        return dono;
    }
    public void setSaldo (float s){
        this.saldo = s;
    }
    public float getSaldo (){
        return saldo;
    }
    public void setStatus (boolean st){
        this.status = st;
    }
    public boolean getStatus(){
        return status;
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (tipo.equals("cc")){
            this.saldo = 50;
        }else if (t.equals("cp")){
            this.setSaldo(150);
        } 
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo()>0){
            System.out.println("Conta com dinheiro");
        }else if (this.getSaldo()<0){
            System.out.println("Conta em débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(float v){
        if (status == true){
            setSaldo(getSaldo()+v);
            System.out.println("Depósito de R$ " + v + " realizado com sucesso na conta de " + this.getDono());
        }else{
            System.out.println("Erro! Conta fechada!");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if(this.getSaldo()>=v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saquel de R$ " + v + " realizado com sucesso na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Erro! Conta fechada!");
        }
    }
    public void pagarMens(){
        int v = 0;
        if (this.getTipo().equals("cc")){
            v=12;
        }else if (this.getTipo().equals("cp")){
            v=20;
        }
        if (this.getStatus()){
            if(this.getSaldo()>=v){
                setSaldo(getSaldo()-v);
                System.out.println("Mensalidade paga com sucesso");
            }else{
                System.out.println("Erro no pagamento da mensalidade! Saldo insuficiente!");
            }
        }else{
            System.out.println("Erro! Conta Fechada");
        }
    }
    
        
    }
    
   
        
    
    

