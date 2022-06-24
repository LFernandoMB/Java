package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // SAÍDA DE DADOS
        float nota = 8.5f;
        String nome = "Gustavo";
        
        System.out.println("A nota é " + nota);
        
        System.out.print("A nota é " + nota);
        System.out.println("<-");
        
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        
        System.out.format("A nota de %s é %.2f \n", nome, nota);
        
        // ENTRADA DE DADOS
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome2 = teclado.nextLine();
        
        System.out.print("Digite a nota do aluno: ");
        float nota2 = teclado.nextFloat();
        
        System.out.printf("A nota de %s é %.3f \n", nome2, nota2);
    }
    
}
