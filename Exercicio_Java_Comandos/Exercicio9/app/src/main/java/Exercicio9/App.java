/*
 * Fa�a um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento ap�s um
 * m�s. Considere fixo o juro da poupan�a em 0,07% a. m;
 */
package Exercicio9;
import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       
       float valorDeposito = 0;
       float juroPoupanca = 0.07f;
       int tempoMeses = 0;
       
       System.out.println("Digite o valor do dep�sito: R$");
       valorDeposito = leitor.nextFloat();
       
       System.out.println("Digite quantos meses a aplica��o ficar� rendendo: ");
       tempoMeses = leitor.nextInt();
       
       float calculoJuros = (valorDeposito * juroPoupanca * tempoMeses) + valorDeposito ;
       
       System.out.println("Ap�s " + tempoMeses + " meses investidos, o rendimento ser� de: R$ " + calculoJuros);
    }
}
