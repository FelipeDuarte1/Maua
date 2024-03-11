package Aula1;
import javax.swing.JOptionPane;

public class ExemploWhile {
    public static void main(String[] args) {

        double nota1, nota2;
        int contador = 1;

        while (contador <= 5) {
        contador++;
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
        
        JOptionPane.showMessageDialog(null, "Média: " + (nota1 + nota2) / 2);
        }
    }
       
          
}
