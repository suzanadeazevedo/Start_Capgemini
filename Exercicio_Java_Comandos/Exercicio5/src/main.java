import java.util.Scanner;

public class main {

    /**
     * Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
     * No final informar o nome do aluno e a sua média (aritmética);
     */
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);     
                    
         System.out.println("Digite o nome do aluno: ");
         String nomeAluno = leitor.nextLine();
         
         System.out.println("Digite a nota da primeira prova: ");
         float provaUm = leitor.nextFloat();
         
         System.out.println("Digite a nota da segunda prova: ");
         float provaDois = leitor.nextFloat();
         
         System.out.println("Digite a nota da terceira prova: ");
         float provaTres =  leitor.nextFloat();
         
         float calculoMedia =  (provaUm + provaDois + provaTres) / 3;
         System.out.println("Aluno: " + nomeAluno + "\nMédia: " + calculoMedia);
         
        
    }
    
}
