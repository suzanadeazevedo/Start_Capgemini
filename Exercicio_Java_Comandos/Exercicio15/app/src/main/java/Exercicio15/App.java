/*
 * Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
 */
package Exercicio15;
import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int valor = 0;
        
        System.out.println("Digite um número inteiro: ");
        valor = leitor.nextInt();
        
        if(valor > 100 && valor < 200) {
        System.out.print("O valor se encontra no intervalo entre 100 e 200");
        }else{
         System.out.println("O valor não se encontra no intervalo entre 100 e 200");
        }
    }
}
