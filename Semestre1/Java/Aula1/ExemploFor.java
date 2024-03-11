package Aula1;

import javax.swing.JOptionPane;

public class ExemploFor {
    public static void main(String[] args) {

        double nota1, nota2;
    for (int contador = 1; contador <= 5; contador++) {

    nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
    nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));

    JOptionPane.showMessageDialog(null, "Média: " + (nota1 + nota2) / 2);
    }
 }
}
