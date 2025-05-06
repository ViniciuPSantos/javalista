import javax.swing.JOptionPane;
public class Piloto{
    private String nome;
    private int horasVoo;
    
    public Piloto(String nome){
        this.nome = nome;
        this.horasVoo = 0;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(){
        this.nome = nome;
    }
    
    public void adicionaHoras(int horas){
        this.horasVoo += horas;
    }
    
    public int getHoras(int horas){
        return horasVoo;
    }
    
    public void Imprime(){
        JOptionPane.showMessageDialog(null, "Nome do piloto: "+nome+ "\n"+ "Tipo: "+ ((horasVoo <= 200) ? "Co-piloto" : "Comandante"), "Horas de voo: "+horasVoo+ "\n"+ "Informações do Piloto:", JOptionPane.INFORMATION_MESSAGE);
    }
}
