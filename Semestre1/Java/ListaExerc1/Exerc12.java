package ListaExerc1;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //declaração de variaveis:
        //float: 4 bytes, double: 8 bytes
        double x1, x2, y1, y2; // Variaveis de entrada
        double distancia; // variavel de saida
        //Entrada
        System.out.println("Digite o valor de x1:");
        x1 = sc.nextFloat();
        System.out.println("Digite o valor de x2:");
        x2 = sc.nextFloat();
        System.out.println("Digite o valor de y1");
        y1 = sc.nextFloat();
        System.out.println("Digite o valor de y2:");
        y2 = sc.nextFloat();

        //Processamento
        distancia = (float) Math.sqrt((x2 - x1) * (x2 - x1) + Math.pow(y2 - y1, 2));
        //a = b ** 2
        //Saída
        //A distancia entre p1(x1, y1) e p2(x2, y2) é: distancia
        System.out.println("A distancia entre p1(" + x1 + ", " + y1 + ") e p2(" + x2 + ", " + y2 + ") é " + distancia);

        System.out.printf(
            "A distancia entre p1(%.2f %.2f) e p2(%.2f, %.2f) é: %.2f",
            x1, y1, x2, y2, distancia);


        sc.close();
    }
}
