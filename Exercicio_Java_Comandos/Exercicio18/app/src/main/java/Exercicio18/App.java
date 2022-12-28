/*
 * Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
 * “menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
 */
package Exercicio18;
import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int idade = 0;
       
        
        for( int i =0; i<75; i++){       
        
        System.out.println("Digite a idade da pessoa: ");
        idade = leitor.nextInt();
        
        if(idade >= 18){
            System.out.println(idade + " é maior de idade");
        }else{
            System.out.println(idade + " é menor de idade");
        }
        }
            
       
    }
}
