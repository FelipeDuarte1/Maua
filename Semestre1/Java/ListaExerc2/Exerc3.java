package ListaExerc2;

import java.util.Scanner;

public class Exerc3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Digite o primeiro numero inteiro: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        b = sc.nextInt();

        if (a > b)
            System.out.println("Primeiro maior que o segundo");
        else 
            System.out.println("Segundo maior que o primeiro");
            
        sc.close();
    }
}
