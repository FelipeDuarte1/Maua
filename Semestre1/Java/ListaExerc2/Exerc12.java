package ListaExerc2;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;
        System.out.println("Digite 3 numeros inteiros:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a == b || a == c || b == c){
            System.out.println("Erro: Os numeros digitados são iguais");
        }
        else {
            int[] numeros = {a, b, c};
            Arrays.sort(numeros);

            System.out.println(Arrays.toString(numeros));
        }
        sc.close();
    }
    
}
