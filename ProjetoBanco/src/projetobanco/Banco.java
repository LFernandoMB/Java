package projetobanco;
    
public class Banco {
    private int dig;
    public String numConta = "00000";
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public Banco(){
        this.setSaldo(0);
        this.setStatus(false); 
    }
    
    public void abrirConta(String dono, String tipo, int dig){
        this.setNumConta(this.getNumConta() + dig);
        this.setDono(dono);
        this.setTipo(tipo);
        this.setStatus(true);
        if (this.getTipo() == "cc"){
            this.setSaldo(50);
            //System.out.println("Conta Corrente criada com sucesso!");
        }else if(this.getTipo() == "cp"){
            this.setSaldo(150);
            //System.out.println("Conta Poupança criada com sucesso!");
        }else{
            System.out.println("Tipo de conta inválido!");
        }
    }
    
    public void fecharConta(){
        if (this.getSaldo() != 0){
            System.out.println("Favor retirar todo valor disponível para seguir com a ação de fechamento!\nValor Disponível: R$" + getSaldo());
        }else{
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }
    
    public void depositar(float valor){
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Novo saldo: R$" + this.getSaldo());
    }
    
    public void sacar(float saque){
        if ((this.isStatus() == true) && (this.getSaldo() >= saque)){
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("Saque de R$" + saque + " ,efetuado com sucesso!");
            System.out.println("Novo saldo: R$" + this.getSaldo()); 
        }else{
            System.out.println("Saldo insuficiente ou conta cancelada! Saldo atual é de: R$" + this.getSaldo());
        }   
    }
    
    public void pagarMensalidade(){
        
        if (this.isStatus() == true){
            if (this.getTipo() == "cc"){
                this.setSaldo(this.getSaldo() - 12);
            }else{
                this.setSaldo(this.getSaldo() - 20);
            }
        
            System.out.println("Mensalidade paga! Saldo atual é: R$" + this.getSaldo());
        }
    }
    
    public void mostrarSaldo(){
        System.out.println("** INFORMAÇÕES SOBRE SUA CONTA **");
        System.out.println("Clinte: " + this.getDono());
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo da Conta: " + this.getTipo());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("*********************************");
        System.out.println("");
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getDig() {
        return dig;
    }

    public void setDig(int qtde) {
        this.dig = qtde;
    }
}
