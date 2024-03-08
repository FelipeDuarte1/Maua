package ListaExerc1;

import java.util.Scanner;
public class Exerc5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, altura, area;
        
        System.out.println("Digite o valor da base: ");
        base = sc.nextDouble();
        System.out.println("Digite o valor da altura: ");
        altura = sc.nextDouble();

        area = base* altura;

        System.out.println("A área do retangulo é de: " + area);


        sc.close();

    }
}
