package com.mycompany.lista;
import javax.swing.JOptionPane;
public class exercicio6 {
    public static class Pessoa {
        String nome, faixa;
        int idade;
        char sexo;
    public void classificar(){
            if (idade <0){
                faixa = "Erro";
            }
            else if (idade <=2){
                faixa = "Bebê";
            }
            else if (idade <= 11){
                faixa = "Criança";
            }
            else if (idade <=19){
                faixa = "Adolescente";
            }
            else if (idade <=30){
                faixa = "Jovem";
            }
            else if (idade <=60){
                faixa = "Adulto";
            }
            else{
                faixa = "Idoso";
            }
        }
        public void imprimir(){
            String msg = "Nome"+nome+"\nIdade"+idade+"\nSexo"+sexo+"\nFaixa etária"+faixa;
            JOptionPane.showMessageDialog(null, msg);
        }
        public static void main(String[] args) {
            Pessoa p = new Pessoa();
            p.nome = JOptionPane.showInputDialog("Digite o nome:");
            p.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
            
            String sexoStr = JOptionPane.showInputDialog("Digite o sexo (M/F):");
            p.sexo = sexoStr.charAt(0);
            
            p.classificar();
            p.imprimir();
        }
    } 
}
