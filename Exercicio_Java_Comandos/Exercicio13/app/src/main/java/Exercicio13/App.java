/*
 * Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
 */
package Exercicio13;
import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        
        System.out.println("Digite um número inteiro: ");
        numero = leitor.nextInt();
        
        if(numero > 10){
            System.out.println("O número digitado é maior que 10");
        }else{
            System.out.println("O número digitado não é maior que 10");
        }
        
        
    }
}
