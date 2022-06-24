package getterssetters;

public class GettersSetters {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.status();
        
        c1.setModelo("Bic Mitchell");
        c1.status();
        c1.setPonta(0.50f);
        c1.tamparDestampar();
        
        c1.status();
        c1.tamparDestampar();
        
        c1.status();
    }
    
}
