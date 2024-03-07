import javax.swing.JOptionPane;

    public class SomaDoisNumeros {

        public static void main(String[] args) {

        //Entrada de dados    
        double primeiroValor;
        double segundoValor;
        double resultado;

        //Processamento
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        resultado = primeiroValor + segundoValor;

        //Saída de dados
                            //JOptionPane.showMessageDialog(null, resultado);

        JOptionPane.showMessageDialog(null, "O resultado é " + resultado);
    }
}