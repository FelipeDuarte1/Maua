package ListaExerc1;

import java.util.Scanner;
public class Exerc2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double a,b,c,d, total;
        
        System.out.println("Digite 4 numeros: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();

        total = a*a + b*b + c*c + d*d;

        System.out.printf("Resultado: %.2f", total);
        sc.close();
    }
}
