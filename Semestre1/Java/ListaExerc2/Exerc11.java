package ListaExerc2;

import java.util.Scanner;

public class Exerc11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código de estado(1-5)");
        var n = sc.nextInt();
        System.out.println("Digite o valor inicial de carga: ");
        var carga = sc.nextDouble();

        if (n == 2 || n == 5) {
            carga = carga - carga * 0.12;
            System.out.println("O valor final da carga é R$ " + carga);     
        }
        else 
            if (n == 1 || n == 3 || n == 5){
                carga = carga - carga * 0.15;
                System.out.println("O valor final da carga é R$ " + carga);
            }
            else 
                System.out.println("Opção invalida");
        sc.close();
    }
}
