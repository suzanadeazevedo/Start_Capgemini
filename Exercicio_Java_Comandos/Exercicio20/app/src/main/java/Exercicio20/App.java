/*
 * A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
 * um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
 * desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
 * sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
 * Informar total de carros com ano até 2000 e total geral;
 */
package Exercicio20;
import java.util.Scanner;

public class App {    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int anoFabricacao = 0;
        float precoVeiculo = 0;
        float veiculoMenorDoisMil = 0.12f;
        float veiculoMaiorDoisMil = 0.07f;
        char continuarCalculando = 'S';
        int totalCarros = 0;
        int totalCarrosMenorDoisMil = 0;
        
        
        while(continuarCalculando == 'S' || continuarCalculando ==  's'){
        
            System.out.println("Digite o ano de fabricação do véiculo: ");
            anoFabricacao = leitor.nextInt();
            System.out.println("Digite o preco do veiculo: R$");
            precoVeiculo = leitor.nextFloat();
            
            if(anoFabricacao < 2000){
               float calculoDescontoUm = (precoVeiculo * veiculoMenorDoisMil);
               System.out.println("O valor do desconto é: R$ " + calculoDescontoUm);
               float precoTotalUm = precoVeiculo - calculoDescontoUm;
               System.out.println("O valor do total é: R$ " + precoTotalUm);
               totalCarros++;
            
               }else{
                    float calculoDescontoDois = (precoVeiculo * veiculoMaiorDoisMil);
                    System.out.println("O valor do desconto é: R$ " + calculoDescontoDois);
                    float precoTotalDois = precoVeiculo - calculoDescontoDois;
                    System.out.println("O valor do otal é: R$ " + precoTotalDois);
                    totalCarrosMenorDoisMil++;
                    }
        System.out.println("Deseja continuar calculando? (Responder: S ou N): ");
        continuarCalculando = leitor.next().charAt(0);
           
        }
        System.out.println("Total de carros abaixo dos anos 2000: "+ totalCarrosMenorDoisMil);
        System.out.println("Total de carros acima dos anos 2000: "+ totalCarros);
    }
}
