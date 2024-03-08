package ListaExerc2;

import javax.swing.JOptionPane;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;


public class Exerc7 {
    
    public static void main(String[] args) {
    
        Double valorRoupa;

        int Opcao;
        valorRoupa = parseDouble(JOptionPane.showInputDialog("Digite o valor da peça: "));
        Opcao = parseInt(JOptionPane.showInputDialog("Escolha o metodo de pagamento: \n 0 - a vista \n 1 - parcelado \n 2 - Crediário"));

        switch (Opcao) {
            case 0:
                double roupa0 = valorRoupa - valorRoupa* 0.10;
                JOptionPane.showMessageDialog(null, "Valor da roupa R$" + roupa0);
                break;
            case 1:
                int parcelas = parseInt(JOptionPane.showInputDialog(null, "Quantas parcelas deseja?"));
                double valorParcelas = valorRoupa / parcelas;
                String exibir = String.format("Valor de cada parcela %f", valorParcelas);
                JOptionPane.showMessageDialog(null, exibir);
                //JOptionPane.showMessageDialog(null, "Valor das parcelas é R$ " + valorParcelas);
                break;
            case 2:
                int parcelas2 = parseInt(JOptionPane.showInputDialog(null, "Quantas parcelas deseja?"));
                double valorParcelas2 = (valorRoupa * 0.10 + valorRoupa) / parcelas2;
                JOptionPane.showMessageDialog(null, "Valor das parcelas é R$ " + valorParcelas2);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcao invalida");
                break;
        }

    }
}