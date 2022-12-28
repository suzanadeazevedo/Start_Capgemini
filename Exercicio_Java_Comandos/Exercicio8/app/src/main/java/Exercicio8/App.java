/*
 * Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
 * dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares
 * disponíveis com o usuário;
 */
package Exercicio8;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        float cotacaoDolar = 0;
        float quantiaDolares =0;
        
        System.out.println("Digite o valor da cotação do dólar: US$ ");
        cotacaoDolar = leitor.nextFloat();
        
        System.out.println("Digite a quantia de dólares que você possuí: US$ ");
        quantiaDolares = leitor.nextFloat();
        
        float calculoReal = cotacaoDolar * quantiaDolares;
        
        System.out.println("O dolar está cotado a US$: " + cotacaoDolar +"\nVocê possui a quantia total de: " + quantiaDolares + "US$" +"\nA conversão em real resulta em: "+ calculoReal + "R$");
        
        
    }
}
