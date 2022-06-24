/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchtest;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SwitchTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o número de acesso: ");
        int num = teclado.nextInt();
        String escolha;
        
        switch (num){
            case 1:
                escolha = "Escolha 1 selecionada!";
                break;
            case 2:
                escolha = "Escolha 2 selecionada!";
                break;
            case 3:
                escolha = "Escolha 3 selecionada!";
                break;
            case 4:
                escolha = "Escolha 4 selecionada!";
                break;
            default:            
                escolha = "Acima de 4 selecionada!";       
        }
        System.out.println(escolha);
    }
    
}
