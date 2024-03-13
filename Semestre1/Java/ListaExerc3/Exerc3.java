package ListaExerc3;

import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: " );
        var N = sc.nextInt();

        for(int i = 0; i < N; i++){
            System.out.println("Digite um numero inteiro e positivo: ");
            var numero = sc.nextInt();

            long fatorial = calculadorFatorial(numero);

            System.out.println("Numero: " + numero + " | Fatorial: " + fatorial);
        }
        sc.close();
    }

    public static long calculadorFatorial(int numero){
        if (numero == 0){
            return 1;
        }
        long resultado = 1;
        for (int i = 1; i <= numero; i++){
            resultado *= i;
        }
        return resultado;
    }
}
