package ListaExerc1;

import java.util.Scanner;

public class Exerc8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroEleitores, votoBranco, votoNulo, votoValido;

        System.out.println("Numero total de eleitores: ");
        numeroEleitores = sc.nextInt();
        System.out.println("Numero de votos brancos: ");
        votoBranco = sc.nextInt();
        System.out.println("Numero de votos nulos: ");
        votoNulo = sc.nextInt();
        System.out.println("Numero de votos validos: ");
        votoValido = sc.nextInt();

        double percentualBrancos = (double) votoBranco / numeroEleitores * 100;
        double percentualNulos = (double) votoNulo / numeroEleitores * 100;
        double percentualValidos = (double) votoValido / numeroEleitores * 100;

        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");
        
        sc.close();
    }
}
