package com.mycompany.lista;
import javax.swing.JOptionPane;

public class Funcionario {
    String nome, dataContratacao, documento;
    int idFunc;
    double salario;
    boolean situacao;
    
    // Exibir detalhes do funcionário
    public void exibirFunc() {
        String status = situacao ? "Ativo" : "Inativo";
        String msg = "ID: " + idFunc + "\nNome: " + nome + 
                     "\nContratado na data de: " + dataContratacao + 
                     "\nDocumento: " + documento + 
                     "\nSalário: R$" + salario + 
                     "\nStatus: " + status;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    // Atualizar salário do funcionário
    public void atualizarFunc() {
        if (situacao) {
            salario = salario * 1.2;
            JOptionPane.showMessageDialog(null, "Salário Atualizado em 20%");
        } else {
            JOptionPane.showMessageDialog(null, "Funcionário inativo! O salário não pode ser atualizado.");
        }
    }
    
    // Verificar a situação do funcionário
    public void verificarFunc() {
        String status = situacao ? "ATIVO" : "INATIVO";
        JOptionPane.showMessageDialog(null, "O Funcionário está " + status + ".");
    }
    
    // Main method
    public static void main(String[] args) {
        // Exemplo de como os diferentes tipos de funcionários podem ser instanciados
        String tipo = JOptionPane.showInputDialog("Digite o tipo de funcionário (Funcionario, Gerente, Secretaria):");
        
        if (tipo.equalsIgnoreCase("Funcionario")) {
            Funcionario func = new Funcionario();
            func = coletarDados(func);
            func.exibirFunc();
            func.verificarFunc();
            func.atualizarFunc();
            func.exibirFunc();
        } else if (tipo.equalsIgnoreCase("Gerente")) {
            Gerente gerente = new Gerente();
            gerente = (Gerente) coletarDados(gerente); // Polimorfismo
            gerente.exibirFunc();
            gerente.verificarFunc();
            gerente.atualizarFunc();
            gerente.exibirFunc();
        } else if (tipo.equalsIgnoreCase("Secretaria")) {
            Secretaria secretaria = new Secretaria();
            secretaria = (Secretaria) coletarDados(secretaria); // Polimorfismo
            secretaria.exibirFunc();
            secretaria.verificarFunc();
            secretaria.atualizarFunc();
            secretaria.exibirFunc();
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de funcionário inválido.");
        }
    }
    
    // Método comum para coletar dados dos funcionários
    public static Funcionario coletarDados(Funcionario funcionario) {
        // Inputs comuns
        funcionario.idFunc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do funcionário"));
        funcionario.nome = JOptionPane.showInputDialog("Digite o nome do funcionário");
        funcionario.dataContratacao = JOptionPane.showInputDialog("Digite a data de sua contratação");
        funcionario.documento = JOptionPane.showInputDialog("Digite o CPF do funcionário");
        
        // O salário será inserido manualmente pelo usuário
        funcionario.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário"));
        
        // Situação do funcionário
        int sit = JOptionPane.showConfirmDialog(null, "Funcionário está ativo?", "Situação", JOptionPane.YES_NO_OPTION);
        funcionario.situacao = (sit == JOptionPane.YES_OPTION);  // Fixando a condição corretamente
        
        // Se for gerente, perguntar o departamento e o usuário
        if (funcionario instanceof Gerente) {
            Gerente gerente = (Gerente) funcionario;
            gerente.departamento = JOptionPane.showInputDialog("Digite o departamento do gerente");
            gerente.usuario = JOptionPane.showInputDialog("Digite o nome de usuário do gerente");
            gerente.senha = JOptionPane.showInputDialog("Digite a senha do gerente");
        }
        
        // Se for secretaria, perguntar o ramal e o número de atendimento
        if (funcionario instanceof Secretaria) {
            Secretaria secretaria = (Secretaria) funcionario;
            secretaria.ramal = Integer.parseInt(JOptionPane.showInputDialog("Digite o ramal da secretária"));
            secretaria.numeroAtendimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de atendimento da secretária"));
        }
        
        return funcionario;
    }
}

// Gerente (Herança de Funcionario)
class Gerente extends Funcionario {
    String usuario, senha, departamento;
    
    // Exibir detalhes do gerente
    @Override
    public void exibirFunc() {
        String status = situacao ? "Ativo" : "Inativo";
        String msg = "ID: " + idFunc + "\nNome: " + nome + 
                     "\nContratado na data de: " + dataContratacao + 
                     "\nDepartamento: " + departamento + 
                     "\nUsuário: " + usuario + 
                     "\nDocumento: " + documento + 
                     "\nSalário: R$" + salario + 
                     "\nStatus: " + status;
        JOptionPane.showMessageDialog(null, msg);
    }
}

// Secretaria (Herança de Funcionario)
class Secretaria extends Funcionario {
    int ramal, numeroAtendimento;
    
    // Exibir detalhes da secretaria
    @Override
    public void exibirFunc() {
        String status = situacao ? "Ativo" : "Inativo";
        String msg = "ID: " + idFunc + 
                     "\nNome: " + nome + 
                     "\nContratado na data de: " + dataContratacao + 
                     "\nDocumento: " + documento + 
                     "\nSalário: R$" + salario + 
                     "\nRamal: " + ramal + 
                     "\nNúmero de Atendimento: " + numeroAtendimento + 
                     "\nStatus: " + status;
        JOptionPane.showMessageDialog(null, msg);
    }
}
