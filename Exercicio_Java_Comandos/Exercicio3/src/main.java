
import java.util.Scanner;

/*
* Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
* total percorrida pelo automóvel e o total de combustível gasto;
*/

public class main {

   
    public static void main(String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);
               
        System.out.println("\n********Calculo de consumo médio de automóvel**********\n");
        
        System.out.println("\nDigite a distancia total percorrida");
        float distancia = leitor.nextFloat();
        
        System.out.println("\nDigite o total de combustivel gasto");
        float combustivel = leitor.nextFloat();
        
        float calculo = distancia / combustivel;
        System.out.println("\nO consumo médio de combustivel foi de: " + calculo);
        
        
        
    }
    
}
