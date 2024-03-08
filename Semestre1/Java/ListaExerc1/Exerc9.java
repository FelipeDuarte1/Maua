package ListaExerc1;

import java.util.Scanner;

public class Exerc9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioAtual, ajuste, novoSalario;

        System.out.println("Digite o seu salario atual: ");
        salarioAtual = sc.nextDouble();
        System.out.println("Digite o percentual de reajuste: ");
        ajuste = sc.nextDouble();

        double percentualAjuste = ajuste / 100;
        novoSalario = (salarioAtual * percentualAjuste) + salarioAtual;

        System.out.println("Seu novo salario eh R$" + novoSalario);

        sc.close();

    }
}
