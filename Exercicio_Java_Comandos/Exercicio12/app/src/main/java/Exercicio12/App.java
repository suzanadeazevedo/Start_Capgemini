/*
 * O custo de um carro novo ao consumidor � a soma do custo de f�brica mais o percentual do distribuidor e
 * dos impostos aplicados (primeiro os impostos s�o aplicados sobre o custo de f�brica, e depois o percentual
 * do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
 * 45%, escreva um algoritmo que leia o custo de f�brica de um carro e informe o custo ao consumidor do
 * mesmo;
 */
package Exercicio12;
import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        float custoDeFabrica = 0;
        float percentualDistribuidor = 0.28f;
        float percentualImpostos = 0.45f;
        
        System.out.println("Digite o custo de fabrica��o do carro: R$ ");
        custoDeFabrica = leitor.nextFloat();
        
        float calculoImposto = (percentualImpostos * custoDeFabrica) + custoDeFabrica;
        float calculoValorDistribuidor = (calculoImposto * percentualDistribuidor) + calculoImposto;
        
        System.out.println("O valor final do ve�culo � de: R$" + calculoValorDistribuidor);
        
    }
}
