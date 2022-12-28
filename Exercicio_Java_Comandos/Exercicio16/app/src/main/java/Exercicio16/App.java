/*
 * Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
 * sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
 * Recuperação (media entre 5.1 a 6.9);
 */
package Exercicio16;
import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String nomeAluno;
        float primeiraNota = 0;
        float segundaNota = 0;
        float terceiraNota = 0;
        
        System.out.println("Digite o nome do(a) aluno(a): ");
        nomeAluno = leitor.nextLine();
        
        System.out.println("Digite a primeira nota do(a) aluno(a) " +  nomeAluno);
        primeiraNota =leitor.nextFloat();
        
        System.out.println("Digite a segunda nota do(a) aluno(a) " +  nomeAluno);
        segundaNota =leitor.nextFloat();
        
        System.out.println("Digite a terceira nota(a) do aluno(a) " +  nomeAluno);
        terceiraNota =leitor.nextFloat();
        
        System.out.println("Primeira Nota: " + primeiraNota);
        System.out.println("Segunda Nota: " + segundaNota);
        System.out.println("Terceira Nota: " + terceiraNota);
        
        float calculoMedia = (primeiraNota + segundaNota + terceiraNota) / 3;
        
        if(calculoMedia >= 7){
            System.out.println("Aluno(a) aprovado(a). Média: " + calculoMedia);
        }else {
            if(calculoMedia >= 5.1f && calculoMedia <= 6.9f){
            System.out.println("Aluno(a) de recuperação. Média " + calculoMedia);
        } else{
               System.out.println("Aluno(a) reprovado(a). Média " + calculoMedia);
            }
        }
        
    }
}
