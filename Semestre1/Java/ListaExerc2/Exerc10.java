package ListaExerc2;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o seu pedido: \n 1 - Misto quente R$5,50 \n 2 - Salada chinesa R$10,20 \n 3 - Suco de Laranja R$4,00 \n 4 - Suco de manga R$3,50");
        var escolha = sc.nextInt();
        
        switch (escolha) {
            case 1:
                System.out.println("Bom apetite, vai lhe custar R$5,50");
                break;
            case 2:
                System.out.println("Bom apetite, vai lhe custar R$10,20");
                break;
            case 3:
            System.out.println("Bom drink, vai lhe custar R$4,00");
                break;
            case 4:
                System.out.println("Bom drink, vai lhe custar R$3,50");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
        sc.close();

        



    }
}
