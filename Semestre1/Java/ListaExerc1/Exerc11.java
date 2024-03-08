package ListaExerc1;

import java.util.Scanner;

public class Exerc11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double carrosVendidos, valorVendas, salarioFixo, valorRecebido, salarioFinal;

        System.out.println("Digite quantos carros foram vendidos: ");
        carrosVendidos = sc.nextDouble();
        System.out.println("Digite o valor total que deu as vendas: ");
        valorVendas = sc.nextDouble();
        System.out.println("Digite o salario fixo: ");
        salarioFixo = sc.nextDouble();
        System.out.println("Digite o valor que recebe por carro vendido: ");
        valorRecebido = sc.nextDouble();

        valorVendas = valorVendas * 0.05;
        valorRecebido = carrosVendidos * valorRecebido;
        salarioFinal = salarioFixo + valorVendas + valorRecebido;

        System.out.println("O salario final do funcionario é R$ "+ salarioFinal);
        sc.close();
    }
}
