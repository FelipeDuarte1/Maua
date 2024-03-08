package Inicio;

import javax.swing.JOptionPane;

public class Exercif {
    public static void main(String args[]){
            double nota;
            nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
            if (nota >= 90){
                JOptionPane.showMessageDialog(null,"Parabens");
                JOptionPane.showMessageDialog(null,"Seu conceito foi A");
            }
            else{
                if (nota >= 80){
                    JOptionPane.showMessageDialog(null,"Seu conceito foi B");                    
                }
                else {
                    if (nota >= 70){
                        JOptionPane.showMessageDialog(null,"Seu conceito foi C");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Nota insuficiente, Reprovado!");
                    }
                }
            }

        }
    
}
