package ListaExerc1;

import java.util.Scanner;

public class Exerc6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        double idadeDias;
        
        System.out.println("Digite sua idade em anos: ");
        idade = sc.nextInt();

        idadeDias = idade * 365;

        System.out.println("Sua idade em dias é : " + idadeDias);
        sc.close();

    }
}
