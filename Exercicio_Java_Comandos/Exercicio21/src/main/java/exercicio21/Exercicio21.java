/*
 * Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
 * ou não para cumprir o serviço militar obrigatório. Informe os totais;
 */

package exercicio21;
import java.util.Scanner;


public class Exercicio21 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
         
        String nome = "";
        char sexo = 'M';
        int idade = 0;
        int saude = 0;
        char continuarCadastro =  'S';
        int contarAptos = 0;
        int contarInaptos = 0;
        
        while(continuarCadastro == 'S' || continuarCadastro == 's'){
        System.out.println("Digite o nome: ");
        nome = leitor.next();
        
        System.out.println("Digite o sexo: M para masculino ou F para feminino ");
        sexo = leitor.next().charAt(0);
        
        System.out.println("Digite a idade: ");
        idade = leitor.nextInt();
        
        System.out.println("Digite o nivel de saúde de 1 a 10: ");
        saude = leitor.nextInt();
        
        if( sexo == 'M' || sexo == 'm' && idade >= 18 && saude >= 5 ){
        System.out.println("Candidato Apto");
        contarAptos++;
        }else{
        System.out.println("Pessoa inapta");
        contarInaptos++;
        }
        
        System.out.println("Deseja continuar cadastrando? Responda S para sim ou N para não:");
        continuarCadastro = leitor.next().charAt(0);              
        
    }
        
       System.out.println("Total de candidatos aptos: " + contarAptos);
       System.out.println("Total de candidatos inaptos: " + contarInaptos);  
        
        
    }
}
