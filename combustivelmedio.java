
package com.mycompany.lista;
import javax.swing.JOptionPane;
public class combustivelmedio {
    public static void main(String[] args) {
        double km, litros, consumomedio;
        km=Double.parseDouble(JOptionPane.showInputDialog("Insira a distancia percorrida"));
        litros=Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de combustivel"));
        consumomedio=(km/litros);
        JOptionPane.showMessageDialog(null, "Você percorreu "+km+" KM com um consumo médio de "+consumomedio+" Litros por KM");
    }
}
