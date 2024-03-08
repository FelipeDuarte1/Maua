package ListaExerc1;

import java.util.Scanner;

public class Exerc15 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;
        System.out.printf("Soma: %d", soma);

        sc.close();
    }
}
