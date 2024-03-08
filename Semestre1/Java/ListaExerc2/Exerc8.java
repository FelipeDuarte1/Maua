package ListaExerc2;

import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de IMC - Índice de Massa Corporal");
        System.out.print("Digite o seu peso em quilogramas: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Calcular o IMC
        double imc = calcularIMC(peso, altura);

        // Determinar a categoria do IMC e exibir mensagem correspondente
        String mensagem = obterMensagemIMC(imc);
        System.out.println("Seu IMC é: " + imc);
        System.out.println("Classificação: " + mensagem);

        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String obterMensagemIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso ideal.";
        } 
        else if (imc >= 18.5 && imc < 25.0) {
            return "Peso ideal, muito bem.";
        } 
        else if (imc >= 25.0 && imc < 30.0) {
            return "Sobrepeso, um regime leve pode ajudar.";
        } 
        else if (imc >= 30.0 && imc < 35.0) {
            return "Obesidade leve.";
        } 
        else if (imc >= 35.0 && imc < 40.0) {
            return "Obesidade moderada.";
        } 
        else {
            return "Obesidade mórbida.";
        }
    }
}
