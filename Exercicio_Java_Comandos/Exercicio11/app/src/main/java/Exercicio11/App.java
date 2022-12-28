/*
 * Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
 * preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
 */
package Exercicio11;
import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       
       float precoCusto = 0;
       float acrescimoPorcentagem = 0;
       
       System.out.println("Digite o valor de custo do produto: R$ ");
       precoCusto = leitor.nextFloat();
       
       System.out.println("Digite o percentual de acrescimo:  ");
       acrescimoPorcentagem = leitor.nextFloat();
       
       float calculoValorVenda = ((acrescimoPorcentagem / 100) * precoCusto) + precoCusto;
       System.out.println("O valor de venda do produto será de: R$ " + calculoValorVenda); 
    }
}
