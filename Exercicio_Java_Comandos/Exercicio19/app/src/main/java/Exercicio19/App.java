/*
 * Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou
 * mulher. No final informe total de homens e de mulheres;
 */
package Exercicio19;
import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        String nome;
        String sexo;
        int masc = 0;
        int fem =  0;
        
        for(int i = 0; i < 3; i ++){
        System.out.println("Digite o nome: ");
        nome = leitor.next();
        
        System.out.println("Digite o sexo masculino ou feminino: ");
        sexo = leitor.next();
        
        if("feminino".equals(sexo)){
            fem = fem + 1;
        
        }else{
             masc = masc + 1; 
        }  
        
        }
        System.out.println("Total mulheres:  " + fem + "\nTotal homens: " + masc);
        
    }
}
