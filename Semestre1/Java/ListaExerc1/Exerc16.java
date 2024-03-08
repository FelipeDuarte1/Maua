package ListaExerc1;

import java.util.Scanner;

public class Exerc16 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor inteiro: ");
        int valor  = sc.nextInt();

        int[] notas = {200, 100, 50, 20, 10, 5, 2, 1};
        int quantidadeNotas = 0;

        System.out.println("O valor " + valor + " pode ser representado por:");

        for (int nota : notas) {
            if (valor >= nota) {
                int quantidade = valor / nota;
                System.out.println("- " + quantidade + " nota(s) de " + nota);
                quantidadeNotas += quantidade;
                valor %= nota;
            }
        }

        System.out.println("Total de notas: \"" + quantidadeNotas + " notas\".");
        sc.close();
    }
}
