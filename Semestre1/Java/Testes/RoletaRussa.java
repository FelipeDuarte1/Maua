import java.util.Random;

public class RoletaRussa{

    public static void main(String[] args) {

        //instância um objeto da classe Random usando o construtor padrão
        Random gerador = new Random();
        
        //imprime sequência de 10 números inteiros aleatórios
        for (int i = 0; i < 1; i++) {
            System.out.println(gerador.nextInt(6));
        }
        if (gerador.nextInt() == 1){
            System.out.println("Morreu trouxa");
        }
        
    }
}