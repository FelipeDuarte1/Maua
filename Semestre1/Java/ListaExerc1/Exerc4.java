package ListaExerc1;

import java.util.Scanner;

public class Exerc4 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n, a;
        System.out.println("Digite o valor");
        n = sc.nextInt();
        
        a = n-1;

        System.out.println("O valor antecessor é : " + a);
    
        sc.close();
    }
}
