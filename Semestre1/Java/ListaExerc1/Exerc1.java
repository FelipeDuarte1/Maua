package ListaExerc1;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double dolarQuantidade;
        Double cotacaoDolar;
        Double valorReal;

        System.out.println("Digite quantos dolares voce tem: ");
        dolarQuantidade = sc.nextDouble();

        cotacaoDolar = 4.94;
        valorReal = cotacaoDolar * dolarQuantidade;

        System.out.printf("Você possui R$ %.2f", valorReal);

        sc.close();
    }
}
