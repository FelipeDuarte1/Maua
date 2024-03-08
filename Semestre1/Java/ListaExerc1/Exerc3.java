package ListaExerc1;

import java.util.Scanner;
public class Exerc3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double precoUnitario, quantidadeVendida, totalVendas, comissao;

        System.out.println("Quantos produtos vendeu? ");
        quantidadeVendida = sc.nextDouble();
        System.out.println("Qual o preço desse produto?");
        precoUnitario = sc.nextDouble();

        totalVendas = precoUnitario * quantidadeVendida;
        comissao = totalVendas * 0.05;

        System.out.printf("O total de vendas foi R$ %.2f, e a comissão foi de R$ %.2f", totalVendas, comissao);
    sc.close();
    }
}
