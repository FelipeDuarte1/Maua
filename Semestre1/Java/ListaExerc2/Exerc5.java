package ListaExerc2;

import java.util.Scanner;

public class Exerc5 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b, c;

    System.out.println("Digite os numeros em seguida: ");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    int soma = a + b + c;

    float media = (a + b + c) / 3;

    float produto = a * b * c;

    System.out.println("Soma: " + soma + "\n Media: " + media + "\n Produto: " + produto);
    if (a > b && b > c)
        System.out.print(a +" é o maior numero");
    else 
        if (b > c && b > a)
            System.out.println(b + " é o maior numero");
        else 
            System.out.println(c + " é o maior numero");

    if (a < b && b < c)
        System.out.print(a +" é o menor numero");
    else 
        if (b < c && b < a)
            System.out.println(b + " é o menor numero");
        else 
            System.out.println(c + " é o menor numero");
    sc.close();
   } 
}
