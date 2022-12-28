/*
 * Leia 80 números e ao final informar quantos número(s) estão no intervalo entre 10 (inclusive) e 150
 * (inclusive);
 */
package Exercicio17;
import java.util.Scanner;

public class App {
   
   

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int numero = 0;
        int con = 0;
        
        for(int i =0; i <80; i++){
        System.out.println("Digite um numero inteiro: ");
        numero = leitor.nextInt();
        if (numero>=10 && numero <=150)
            con++;
        }
        System.out.println("Foram encontrados " + con + " números no intervalo entre 10 e 150");
    }
}
