package Aula1;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;
import static java.lang.Long.parseLong;

public class Exerc3 {
    public static void main(String[] args) {
        long n = parseLong(JOptionPane.showInputDialog("Digite o valor:"));
        long fatorial = 1;

        for (long cont = 1; cont <= n; cont++){
            fatorial = fatorial * cont;
        }
        JOptionPane.showMessageDialog(null, String.format("%d! = %d", n , fatorial));
    }
    
}
