/*
 * Fa�a um algoritmo que receba o pre�o de custo de um produto e mostre o valor de venda. Sabe-se que o
 * pre�o de custo receber� um acr�scimo de acordo com um percentual informado pelo usu�rio;
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
       System.out.println("O valor de venda do produto ser� de: R$ " + calculoValorVenda); 
    }
}
