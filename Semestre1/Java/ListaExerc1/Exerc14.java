package ListaExerc1;

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite a nota A: ");
        float notaA = sc.nextFloat();
        System.out.println("Digite a nota B: ");
        float notaB = sc.nextFloat();
        System.out.println("Digite a nota C: ");
        float notaC = sc.nextFloat();

        float mediaFinal = (notaA * 2 + notaB * 3 + notaC * 5) / 10;
        System.out.println("Sua media foi: " + mediaFinal);
        sc.close();
    }
}
