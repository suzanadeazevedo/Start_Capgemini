import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Fa�a um algoritmo que receba dois n�meros e ao final mostre a soma, subtra��o, multiplica��o e a divis�o
        //dos dois números lidos;

        Scanner leitor = new Scanner(System.in);

        System.out.println("\nCalculo b�sico");
        System.out.println("\nUsar virgula para separar os n�meros\n");

        System.out.println("Digite o primeiro n�mero: ");
        float primeiroNumero = leitor.nextFloat();

        System.out.println("Digite o segundo n�mero: ");
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
