package ListaExerc2;

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro de quatro digitos: ");
        var n = sc.nextInt();
        var digito1 = 0;
        if (n >= 1000 && n <= 9999){
             digito1 = n / 1000;
            int digito2 = (n % 1000) / 100;
            int digito3 = (n % 100) / 10;
            int digito4 = n % 100;

            if ((digito1 == 8 || digito1 == 5) &&
                (digito4 == 5 || digito4 == 1) &&
                ((digito2 + digito3 == 3 && digito4 == 5) || (digito2 + digito3 == 0 && digito4 == 1))) {
                System.out.println("A senha é válida.");
            } 
            else {
                System.out.println("A senha é inválida.");
            }
        }
        else {
            System.out.println("O número digitado não possui quatro dígitos.");
        }
        sc.close();
    }
}
