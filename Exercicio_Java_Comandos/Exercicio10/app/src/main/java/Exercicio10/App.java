/*
 * A Loja Mam�o com A��car est� vendendo seus produtos em 5 (cinco) presta��es sem juros. Fa�a um
 * algoritmo que receba um valor de uma compra e mostre o valor das presta��es;
 */
package Exercicio10;
import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int parcelasSemJuros = 5;
       float valorCompra = 0;
       
       System.out.println("Digite o valor da compra: R$ ");
       valorCompra = entrada.nextFloat();
       
       float calculoValorParcelado = valorCompra / parcelasSemJuros;
       
       System.out.println("O valor da compra parcelada � de: R$ " + calculoValorParcelado);
       
        
    }
}
