import javax.swing.JOptionPane;
public class exercicio2 {
    public static void main(String[] args) {
        double valor, desconto, valor2;
        valor=Double.parseDouble(JOptionPane.showInputDialog("Insira o valor total da compra"));
        // é necessário calcular o desconto com numero com virgula(no caso ponto) para que o desconto seja aplicado corretamente // 
        desconto = ((10.0/100)*valor);
        valor2 = (valor-desconto);
        if (valor <= 199.99){
            JOptionPane.showMessageDialog(null, "Você não receberá desconto! \n O valor permanecerá "+valor);
        }
        else if (valor >= 200){
            JOptionPane.showMessageDialog(null, "Você recebeu um desconto de R$"+desconto+ "\n O valor final da compra é R$"+valor2);
        }
    }
}
