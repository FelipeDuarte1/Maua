package ListaExerc2;

import java.util.Scanner;

public class Exerc4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira dois numeros: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a > b)
            System.out.println(a +" é o maior");
        else 
            if (b > a)
                System.out.println(b +" é o maior");
            else
                System.out.println("São iguais");
        sc.close();
    }
}
