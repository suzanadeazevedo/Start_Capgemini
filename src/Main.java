import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Faça um algoritmo que receba dois números e exiba o resultado da sua soma;

        Scanner leitor = new Scanner(System.in);

        System.out.println("\n*********** Soma **********");
        System.out.println("\nEm caso de numero com decimal, usar virgula para separar\n ");

        System.out.println("Digite o primeiro número: ");
        float primeiroNumero = leitor.nextFloat();

        System.out.println("Digite o segundo número: ");
        float segundoNumero = leitor.nextFloat();

        float calculo = primeiroNumero + segundoNumero;

        System.out.println("Resultado da soma: " + calculo);


    }
}
