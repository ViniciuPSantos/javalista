import javax.swing.JOptionPane;
public class exercicio4 {
    public static void main(String[] args) {
        int opcao;
        opcao=Integer.parseInt(JOptionPane.showInputDialog("MENU DE ATENDIMENTO \n 1-Suporte Técnico \n 2- Financeiro \n 3-Falar com um atendente \n 4-Cancelar serviço \n 5-Encerrar atendimento"));
        switch (opcao){
            case 1:
                JOptionPane.showMessageDialog(null, "Você escolheu a opcção Suporte Técnico.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Você escolheu a opcção Financeiro.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Você escolheu a opção Falar com um atendente.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Você escolheu a opção Cancelar Serviço.");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Você escolheu a opção Encerrar atendimento.");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida. Tente Novamente!");
                break;
        }
    }
}
