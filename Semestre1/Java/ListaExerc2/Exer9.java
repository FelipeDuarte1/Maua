package ListaExerc2;

import java.util.Scanner;

import javax.swing.JOptionPane;

import static java.lang.Double.parseDouble;

public class Exer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b;
        a = parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota:"));
        b = parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota:"));

        double media = (a + b) / 2;
        String mensagem = obterMensagemMedia(media);
        JOptionPane.showMessageDialog(null, "Sua media foi: " + media + " - " + mensagem);

        
        sc.close();
        
    }

    public static String obterMensagemMedia(double media) {
        if (media < 2) {
            return "Repetiu de ano legal";
        } 
        else if (media >= 2 && media < 6) {
            return "Não aprovado";
        } 
        else if (media >= 6 && media < 7) {
            return "Aprovado no limite";
        } 
        else if (media >= 7 && media < 9) {
            return "Aprovado";
        } 
        else {
            return "Parabens";
        }
    }
    
}
