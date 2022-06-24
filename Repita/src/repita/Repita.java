/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repita;

import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Repita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, soma = 0;
        int pares =0, impares = 0;
        int maiorCem = 0;
        float media = 0;
        int divisor = 0;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));
            soma += num;
            
            if (num %2 == 0){
                pares++;
            }else{
                impares++;
            }
            
            if (num > 100){
                maiorCem++;
            }
            
            divisor++;
            
        }while(num != 0);
        
        media = soma/divisor;
        
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <br><hr><br> Somatório: " + soma + "<br>Total de Pares: " + pares + "<br>Total de Ímpares: " + impares + "<br>Números > 100: " + maiorCem + "<br>Média dos valores: " + media + "</html>");
    }
    
}
