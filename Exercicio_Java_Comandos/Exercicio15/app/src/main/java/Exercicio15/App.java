/*
 * Fa�a um algoritmo que receba um n�mero e diga se este n�mero est� no intervalo entre 100 e 200;
 */
package Exercicio15;
import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int valor = 0;
        
        System.out.println("Digite um n�mero inteiro: ");
        valor = leitor.nextInt();
        
        if(valor > 100 && valor < 200) {
        System.out.print("O valor se encontra no intervalo entre 100 e 200");
        }else{
         System.out.println("O valor n�o se encontra no intervalo entre 100 e 200");
        }
    }
}
