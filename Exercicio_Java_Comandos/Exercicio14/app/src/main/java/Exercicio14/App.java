/*
 * Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
 */
package Exercicio14;
import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        float primeiroValor = 0;
        float segundoValor = 0;
        
        System.out.println("Digite o primeiro valor: ");
        primeiroValor = leitor.nextFloat();
        
        System.out.println("Digite o segundo valor: ");
        segundoValor = leitor.nextFloat();
        
        if(primeiroValor > segundoValor){
            System.out.println("O primeiro valor digitado é maior (" + primeiroValor + ")");
        }else{
            System.out.println("O segundo valor digitado é maior (" + segundoValor + ")" );
        }
        
    }
}
