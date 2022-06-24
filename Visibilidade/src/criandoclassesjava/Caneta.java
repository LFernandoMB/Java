package criandoclassesjava;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Destampar primeiro!");
        }else{
            System.out.println("RABISCANDO!!!");
        }
    }
    
    protected void tampdestamp(){
        if (this.tampada == true){
            this.tampada = false;
        }else{
            this.tampada = true;
        }
    }
    
    public void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Modelo: " + this.modelo);
    }
    
    public void linha(){
        System.out.println("-----------------------------------------");
    }
}
