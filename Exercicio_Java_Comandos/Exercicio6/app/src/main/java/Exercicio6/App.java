/*
 * Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a
 * possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores
 * trocados;
 */
package Exercicio6;
import java.util.Scanner;
public class App {
   

    public static void main(String[] args) {
        
        int a = 0;
        int b = 0;
        int aux = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro para o valor A: ");
        a = leitor.nextInt();
       
        
        System.out.println("Digite um número inteiro para o valor B: ");
        b = leitor.nextInt();
        
         aux=a;
         a=b;
         b=aux;
      
        System.out.println("Troca de A para B: " + a);
        
       
        System.out.println("Troca de B para A: "+ b);
        
        
        
        
       
        
        
    }
}
