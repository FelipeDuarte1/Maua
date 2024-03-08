package ListaExerc1;

import java.util.Scanner;
import java.lang.Math;

public class Exerc13 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio do circulo: ");
        double raio = sc.nextDouble();

        Double area = Math.PI * raio*raio;

        System.out.println("A area do circulo é de: " + area);


        sc.close();
    }
}
