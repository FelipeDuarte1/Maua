import java.util.Scanner;

public class Exerc15 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor por hora: ");
        var valorHora = sc.nextDouble();

        System.out.println("Digite o numero de horas trabalhadas: ");
        var HorasTrabalhadas = sc.nextInt();

        System.out.println("Digite o imposto(entre 0 e 1): ");
        var imposto = sc.nextDouble();

        System.out.println("Digite o valor da comisão: ");
        var comissao = sc.nextDouble();

        double salarioBruto = valorHora * HorasTrabalhadas;

        if (HorasTrabalhadas >= 120){
            salarioBruto += comissao;
        }
        double salarioLiquido = salarioBruto - (salarioBruto * imposto);

        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Salario liquido " + salarioLiquido);

        sc.close();
    }
}
