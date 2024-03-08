package ListaExerc1;

import java.util.Scanner;

public class Exerc10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Double novoCarro, custoFabrica, porcenDistri, porcenImposto;

        System.out.println("Digite o custo de fábrica de um carro:");
        custoFabrica = sc.nextDouble();

        porcenImposto = custoFabrica* 0.45;
        porcenDistri = custoFabrica * 0.28;
        novoCarro = custoFabrica + porcenImposto + porcenDistri;

        System.out.println(porcenDistri);
        System.out.println(porcenImposto);
        System.out.println("O preço do seu carro será: "+ novoCarro);


        sc.close();
    }
}
