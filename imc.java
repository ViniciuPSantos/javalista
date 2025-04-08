import javax.swing.JOptionPane;
public class exercicio3 {
    public static void main(String[] args) {
        double altura, peso, imc;
        altura=Double.parseDouble(JOptionPane.showInputDialog("Insira a sua altura em Metros."));
        peso=Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura em KG."));
        imc=(peso/(altura*altura));
        if (imc <= 18.5){
            JOptionPane.showMessageDialog(null, "Você está abaixo do peso!");
        }
        else if ((imc>=18.5) && (imc<=24.9)){
            JOptionPane.showMessageDialog(null, "Você está no seu peso normal.");
        }
        else if ((imc>=25) && (imc<=29.9)){
            JOptionPane.showMessageDialog(null, "Você está com sobrepeso!");
        }
        else if (imc >=30){
            JOptionPane.showMessageDialog(null, "Você está com obesidade!");
        }
    }
}
