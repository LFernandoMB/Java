package getterssetters;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String status;
    
    public Caneta(){
        this.modelo = "Teste";
        this.ponta = 0.7f;
        this.tampada = true;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float ponta){
        this.ponta = ponta;
    }
    
    public void tamparDestampar(){    
        if (this.tampada == true){
            this.tampada = false;
            this.status = "Destampada";
        }else{
            this.tampada = true;
            this.status = "Tampada";
        }
    }
    
    public void status(){
        System.out.println("** INFORMAÇÕES SOBRE A CANETA **");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ponta: " + getPonta());
        System.out.println("Status: " + this.status);
        System.out.println("********************************");
    }
    
}
