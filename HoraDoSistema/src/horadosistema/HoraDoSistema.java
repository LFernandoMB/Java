package horadosistema;

import java.util.Date;
import java.util.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.print("A hora do sistema é: ");
        System.out.println(relogio.toString());
        
        Locale loc = Locale.getDefault();
        System.out.print("Método 1 - Idioma do sistema é: ");
        System.out.print(loc.getDisplayLanguage());
        System.out.print("/");
        System.out.println(loc.getLanguage());
        
        System.out.print("Método 2 - Idioma do sistema é: ");
        System.getProperties();
        System.out.println(System.getProperty("user.language"));
        
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) tela.getWidth();
        int altura = (int) tela.getHeight();   
        System.out.println("A resolução da tela é: " + largura + " x " + altura);   
    }   
}
