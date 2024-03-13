package ListaExerc3;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        var n = sc.nextInt();

        double E = 1;
        double fatorial = 1;

        for (int i = 1; i <= n; i++){
            fatorial *= i;

            E += 1.0 / fatorial;
        }
        System.out.println("O valor de E é: " + E);
        
        sc.close();
    }
}
