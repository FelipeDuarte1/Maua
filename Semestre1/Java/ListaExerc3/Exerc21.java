package ListaExerc3;

import java.util.Scanner;

public class Exerc21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorDigitado;
        //variavel acumuladora recebe 0, como soma
        //todo contador é acumulador, mas nem todo acumulador é contador.
        double soma = 0; // acumulador
        int quantidadeDigitados = 0; //acumulador e contador
        double media = 0; //acumulador
        double maior = -1; //nem um nem outro, só uma variavel de comparacao
        double menor = -1; //só variavel para comparacao
        double mediaPares = 0; //acumulador condicional
        double percentualImpares = 0; //acumulador e contador
        double paresEscritos = 0;
        final int VALOR_SENTINELA = 30000; //variavel final, ou seja, fixa sempre e nao altera o valor, possui escrita snake_case e sempre maiusculo.
        int i = 1;
        do{
            System.out.println("Digite " + (i++) +"º valor: ");
            valorDigitado = sc.nextDouble();
            if(valorDigitado != VALOR_SENTINELA){
                soma = soma + valorDigitado;
                quantidadeDigitados++;
                media = soma / quantidadeDigitados;
                if(maior == -1 || valorDigitado > maior) maior = valorDigitado;
                menor = menor == - 1 || valorDigitado < menor ? valorDigitado : menor; //Estilo alternario
                //if(ValorDigitado %2 ==0)
                //    mediaPares += valorDigitado
                mediaPares = mediaPares + valorDigitado * (1 - valorDigitado % 2);
                paresEscritos += valorDigitado % 2;
                percentualImpares += valorDigitado % 2;
            }

        }while(!(valorDigitado == VALOR_SENTINELA));

        mediaPares = mediaPares / paresEscritos;
        percentualImpares = percentualImpares / quantidadeDigitados * 100;

        //System.out.println("A soma é " + soma);
        //System.out.println("A quantidade digitados é " +quantidadeDigitados);
        //System.out.println("A media é " +media);
        //System.out.println("O maior valor é " +maior);
        //System.out.println("O menor valor é " +menor);
        //System.out.println("A media dos numeros pares é " + mediaPares);
        //System.out.println("A porcentagem de n impares é " + percentualImpares);

        System.out.printf("A soma é %f  | A quantidade digitados é %d | A media é %f | O maior valor é %f | O menor valor é %f | A media dos n pares é %f | A porcentagem de n impares é %f ", soma, quantidadeDigitados, media, maior , menor, mediaPares, percentualImpares);
        //enviar solucao para rodrigo.moreira@maua.br
        sc.close();

    }
}
