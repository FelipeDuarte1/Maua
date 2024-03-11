package ListaExerc2;

import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[10];
        int alunosNota8 = 0;
        int alunosNota0 = 0;
        double somaNotas = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Digite a nota do aluno" + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            somaNotas += notas[i];

            if (notas[i] > 8) {
                alunosNota8++;
            }
            else if (notas[i] == 0){
                alunosNota0++;
            }
        }

        double media = somaNotas / 10;

        if (media >= 6) {
            System.out.println("A media das notas é: " + media);
            System.out.println("Quantidade de alunos com nota 8 ou maior: " + alunosNota8);
        }
        else {
            System.out.println("A media das notas é: " + media);
            System.out.println("Quantidade de alunos com nota 0 " + alunosNota0);
        }

        sc.close();
    }
}
