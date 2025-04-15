package com.mycompany.lista;
import javax.swing.JOptionPane;
public class Funcionario {
    String nome, departamento, dataContratacao, documento;
    int idFunc;
    double salario;
    boolean situacao;
    
    public void exibirFunc(){
        String status = situacao ? "Ativo" : "Inativo";
        String msg = "ID: "+idFunc+"\n Nome: "+nome+ 
                "\n Departamento: "+departamento+
                "\n Contratado na data de: "+dataContratacao+
                "\n Documento: "+documento+
                "\n Salário: "+salario+
                "\n Status: "+situacao;
        JOptionPane.showMessageDialog(null, msg);
    }
    public void atualizarFunc(){
        if (situacao){
            salario = salario * 1.2;
            JOptionPane.showMessageDialog(null, "Salário Atualizado em 20%");
        }
        else {
            JOptionPane.showMessageDialog(null, "Funcionário inativo! O salário não pode ser atualizado.");
        }
    }
    public void verificarFunc(){
        if (situacao){
            JOptionPane.showMessageDialog(null,"O Funcionário está ATIVO.");
        }
        else{
            JOptionPane.showMessageDialog(null,"O Funcionário está INATIVO.");
        }
    }
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        
        func.idFunc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do funcionário"));
        func.nome = JOptionPane.showInputDialog("Digite o nome do funcionário");
        func.departamento = JOptionPane.showInputDialog("Digite o departamento onde ele trabalha");
        func.dataContratacao = JOptionPane.showInputDialog("Digite a data de sua contratação");
        func.documento = JOptionPane.showInputDialog("Digite o CPF do funcionario");
        func.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário"));
        int sit = JOptionPane.showConfirmDialog(null, "Funcionário está ativo?", "Situação", JOptionPane.YES_NO_OPTION);
        func.situacao = (sit == JOptionPane.YES_NO_OPTION);
        
        func.exibirFunc();
        func.verificarFunc();
        func.atualizarFunc();
        
       
        func.exibirFunc();
    }   
}
