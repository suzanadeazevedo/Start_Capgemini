/*
 * Fa�a um algoritmo que receba um n�mero e mostre uma mensagem caso este n�mero seja maior que 10;
 */
package Exercicio13;
import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        
        System.out.println("Digite um n�mero inteiro: ");
        numero = leitor.nextInt();
        
        if(numero > 10){
            System.out.println("O n�mero digitado � maior que 10");
        }else{
            System.out.println("O n�mero digitado n�o � maior que 10");
        }
        
        
    }
}
