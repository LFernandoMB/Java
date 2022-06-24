package criandoclassesjava;

public class CriandoClassesJava {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        
        
        c1.rabiscar();
        c1.tampdestamp();
        c1.status();
    }
    
}
