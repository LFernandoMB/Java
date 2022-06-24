package criandoclassesjava;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Destampar primeiro!");
        }else{
            System.out.println("RABISCANDO!!!");
        }
    }
    
    void tampdestamp(){
        if (this.tampada == true){
            this.tampada = false;
        }else{
            this.tampada = true;
        }
    }
    
    void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Modelo: " + this.modelo);
    }
    
    void linha(){
        System.out.println("-----------------------------------------");
    }
}
