import java.util.Scanner;

public class TesteIdade{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade em anos:");
        int idadeAnos = sc.nextInt();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Calcular idade em dias");
        System.out.println("2 - Calcular idade em meses");
        System.out.println("3 - Calcular idade em anos");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                calcularIdadeEmDias(idadeAnos);
                break;
            case 2:
                calcularIdadeEmMeses(idadeAnos);
                break;
            case 3:
                System.out.println("Sua idade em anos é : " + idadeAnos);
                break;
            default:
                System.out.println("Opção inválida");
        }
        sc.close();
    }

    public static void calcularIdadeEmDias(int idadeAnos){
        int idadeDias = idadeAnos * 365;
        System.out.println("Sua idade em dias é:" + idadeDias);
    }
    public static void calcularIdadeEmMeses(int idadeAnos){
        int idadeMeses = idadeAnos * 12;
        System.out.println("Sua idade em meses é: " + idadeMeses);
    }
}