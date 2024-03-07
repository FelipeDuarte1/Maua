import java.util.Scanner;

public class TesteIdade3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Como você deseja informar sua idade?");
        System.out.println("Dias");
        System.out.println("Meses");
        System.out.println("Anos");
        char opcaoInformarIdade = sc.next().charAt(0);

        int idade = 0;

        switch (opcaoInformarIdade){
            case 'D':
            case 'd':
                System.out.println("Digite sua idade em dias:");
                int idadeDias = sc.nextInt();
                idade = idadeDias;
                break;
            case 'M':
            case 'm':
                System.out.println("Digite sua idade em meses:");
                int idadeMeses = sc.nextInt();
                idade = idadeMeses * 30;
                break;
            case 'A':
            case 'B':
                System.out.println("Digite sua idade em anos:");
                int idadeAnos = sc.nextInt();
                idade = idadeAnos * 365;
                break;
            default:
                System.out.println("Opção inválida");
        }
        System.out.println("Como você deseja ver sua idade?");
        System.out.println("Dias");
        System.out.println("Meses");
        System.out.println("Anos");
        char opcaoTransformarIdade = sc.next().charAt(0);

        switch (opcaoTransformarIdade){
            case 'D':
            case 'd':
                System.out.println("Sua idade em dias eh: " + idade);
                break;
            case 'M':
            case 'm':
                System.out.println("Sua idade em meses eh: " + (idade/30));
                break;
            case 'A':
            case 'a':
                System.out.println("Sua idade em anos eh: " + (idade/365));
                break;
            default:
                System.out.println("Opção inválida");
        }

        sc.close();
    }
}