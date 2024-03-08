package ListaExerc2;

import java.util.Scanner;

public class Exerc6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double a, b, resto;
        System.out.println("Digite o saldo na conta: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor do saque: ");
        b = sc.nextDouble();

        resto = a - b;
        if (a > b)
            System.out.println("O saldo restante na conta é de R$ " + resto);

        else
            System.out.println("Nao foi possivel realizar o saque");


    
        sc.close();
    }
}
