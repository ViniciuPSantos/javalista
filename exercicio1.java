import javax.swing.JOptionPane;
public class exercicio1 {
    public static void main(String[] args) {
        int numero, i;
        numero=Integer.parseInt(JOptionPane.showInputDialog("insira um número"));
        if (numero == 0){
            JOptionPane.showMessageDialog(null,"O número é zero");
        }
        else if (numero>=0){
            JOptionPane.showMessageDialog(null,"O número é inteiro positivo");
        }
        else if (numero<= 0){
            JOptionPane.showMessageDialog(null,"O número é inteiro negativo");
        }
    }
}
