import javax.swing.JOptionPane;
public class Aviao{
    private int horasAtividade;
    
    public Aviao(){
        this.horasAtividade = 0;
    }
    
    public void fazVoo(int horas, Piloto piloto){
        if (horasAtividade + horas > 200){
            JOptionPane.showMessageDialog(null, "Voo não autorizado: o avião precisa de revisão", "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
            horasAtividade += horas;
            piloto.adicionaHoras(horas);
        }
    }
    
    public void fazRevisao(){
        horasAtividade = 0;
        JOptionPane.showMessageDialog(null, " Revisão concluída: horas de atividade zeradas.", "Revisão", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void Imprime (){
        JOptionPane.showMessageDialog(null, "Horas acumuladas do avião: "+horasAtividade+ "\n"+ "Status: o avião "+((horasAtividade >= 200) ? "precisa de revisão" : "Não precisa de revisão."), "Informações do Avião", JOptionPane.INFORMATION_MESSAGE);
    }
}
