/*
 * Elabore um algoritmo que efetue a apresenta��o do valor da convers�o em real (R$) de um valor lido em
 * d�lar (US$). O algoritmo dever� solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares
 * dispon�veis com o usu�rio;
 */
package Exercicio8;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        float cotacaoDolar = 0;
        float quantiaDolares =0;
        
        System.out.println("Digite o valor da cota��o do d�lar: US$ ");
        cotacaoDolar = leitor.nextFloat();
        
        System.out.println("Digite a quantia de d�lares que voc� possu�: US$ ");
        quantiaDolares = leitor.nextFloat();
        
        float calculoReal = cotacaoDolar * quantiaDolares;
        
        System.out.println("O dolar est� cotado a US$: " + cotacaoDolar +"\nVoc� possui a quantia total de: " + quantiaDolares + "US$" +"\nA convers�o em real resulta em: "+ calculoReal + "R$");
        
        
    }
}
