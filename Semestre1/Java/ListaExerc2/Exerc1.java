package ListaExerc2;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a;
        double b;

        System.out.println("Digite o numero inteiro: ");
        a = sc.nextInt();
        System.out.println("Digite o numero real: ");
        b = sc.nextDouble();

        if (a < b)
            System.out.printf("O numero %f(real) é maior que %d(inteiro)", b, a);
        else

        sc.close();
    }
}
