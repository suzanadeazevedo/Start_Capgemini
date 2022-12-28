/*
 * Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
 * conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius;
 */

package main;
import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        float grausCelsius = 0;
        
        
        System.out.println("Digite a temperatura em graus Celsius: ");
        grausCelsius = leitor.nextFloat();
        float conversaoFahrenheit = (9 * grausCelsius + 160) / 5;
        
        System.out.println("O resultado da conversão é de: " + conversaoFahrenheit + "F");
        
        
        
    }
}
