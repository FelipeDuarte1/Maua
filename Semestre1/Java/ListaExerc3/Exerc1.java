package ListaExerc3;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano atual: ");
        var anoAtual = sc.nextInt();

        double valor1 = 1000;

        for (int i = 2006; i <= anoAtual; i++){
            double porcentagemAumento = 0.015;

            if (i > 2006){
                porcentagemAumento *=2;
            }

            valor1 += valor1 * porcentagemAumento;
            
        }
        System.out.println("O salario atual do funcionario é R$ " + valor1);
        sc.close();

    }
}
