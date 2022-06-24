/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Entre com o primeiro número: ");
        int n1 = teclado.nextInt();
        System.out.print("Entre com o segundo número: ");
        int n2 = teclado.nextInt();
        
        float div = n1 / n2;
        float resto = n1 % n2;
        
        System.out.println("A  divisão de " + n1 + " e " + n2 + " é igual a " + div);
        System.out.println("O resto da divisão de " + n1 + " e " + n2 + " é igual a " + resto);
        
        int n = 4;
        System.out.println("O valor de n é " + n++);
    }
    
}
