
package com.mycompany.lista;
import javax.swing.JOptionPane;
public class media {
        public static void main(String[] args) {
        double p1, p2, p3, media;
        p1=Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da primeira prova"));
        p2=Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da segunda prova"));
        p3=Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da terceira prova"));
        media=(((p1*3)+(p2*3)+(p3*4))/10);
        if (media>=7){
            JOptionPane.showMessageDialog(null, "Sua média é " +media);
            JOptionPane.showMessageDialog(null, "Parabéns aprovado!!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Sua média é " +media);
            JOptionPane.showMessageDialog(null, "Reprovado!!");
        }
    }
}

