/*
*Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
*por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
*efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
*/

import java.util.Scanner;
public class main {

    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do vendedor: ");
        String nomeVendedor = leitor.nextLine();
        
        System.out.println("Digite o salario base: R$ ");
        float salarioBase = leitor.nextFloat();
        
        System.out.println("Digite o total de vendas efetuada pelo vendedor " + nomeVendedor + ": R$");
        float totalVendas = leitor.nextFloat();
        
        float comissao = totalVendas * 0.15f;
        
        float calculoSalario = salarioBase + comissao;
        System.out.println("Vendedor: " + nomeVendedor + "\nSalario base: R$" + salarioBase +  "\nComissão: R$" + comissao +"\nSalario base + comissão: " + calculoSalario);   
        
        
        
    }
    
}
