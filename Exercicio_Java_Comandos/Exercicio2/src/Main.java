import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
        //dos dois nÃºmeros lidos;

        Scanner leitor = new Scanner(System.in);

        System.out.println("\nCalculo básico");
        System.out.println("\nUsar virgula para separar os números\n");

        System.out.println("Digite o primeiro número: ");
        float primeiroNumero = leitor.nextFloat();

        System.out.println("Digite o segundo número: ");
        float segundoNumero = leitor.nextFloat();


        float soma = primeiroNumero + segundoNumero;
        System.out.println("Resultado da soma: " + soma);

        float subtracao = primeiroNumero - segundoNumero;
        System.out.println("Resultado da subtracao: " + subtracao);

        float multiplicacao = primeiroNumero * segundoNumero;
        System.out.println("Resultado da multiplicao: " + multiplicacao);

        float divisao = primeiroNumero / segundoNumero;
        System.out.println("Resultado da divisao: " + divisao);



    }
}
