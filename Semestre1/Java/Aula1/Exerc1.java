package Aula1;

import javax.swing.JOptionPane;

public class Exerc1 {
    public static void main(String[] args) {
    //repeticao controlada por contador
    //3 partes
    // declaração/inicialização
    int contador = 1;
    //teste de continuidade
    while(contador <=3){
        JOptionPane.showMessageDialog(null, contador);
    
        //atualização/incremento
        contador++;
    }

    for( contador = 1; contador <= 3; contador++){
        System.out.println(contador);
    }
    int a = 2;
    a = a + 1;
    a +=1;
    a++;
    ++a;
    System.out.println(a);
    System.out.println();
    contador = 1;   
    while (contador <=3) {
        System.out.println(contador++);        
    }
    
 }
}
