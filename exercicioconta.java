package com.mycompany.lista;
import javax.swing.JOptionPane;
public class contaBancaria {
    int numeroConta;
    double saldo, limite;
    
    public void depositar(double valor){
        if (valor > 0){
            saldo +=valor;
            JOptionPane.showMessageDialog(null, "Deposito de R$"+valor+" realizado com sucesso!");
        }
        else{
            JOptionPane.showMessageDialog(null, " Valor inválido para depósito");
        }
    }
    
    public void sacar(double valor){
        if (valor > 0 && valor <= (saldo+limite)){
            saldo -=valor;
            JOptionPane.showMessageDialog(null, "Saque de R$"+valor+" realizado com sucesso!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente ou valor inválido para saque.");
        }
    }
    
    public void imprimirExtrato(){
        JOptionPane.showMessageDialog(null,
                "Numero da Conta:"+numeroConta+
                "\nSaldo:"+saldo+
                "\nLimite:"+limite);
    }
    
    public void consultarSaldo(){
        double disponivel = saldo+limite;
        JOptionPane.showMessageDialog(null, "Saldo disponível:"+disponivel);
    }
    
    public static void main(String[] args) {
         contaBancaria c = new contaBancaria();
        
        c.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta"));
        c.saldo = Double.parseDouble(JOptionPane.showInputDialog("Digie o saldo inicial"));
        c.limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta"));
        
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n1-Depositar \n2- Sacar \n3-Extrato \n4-Consultar saldo \n0-Sair"));
            switch (opcao){
                case 1:
                    double valorDep = Double.parseDouble(JOptionPane.showInputDialog("Valor a depositar:"));
                    c.depositar(valorDep);
                    break;
                case 2:
                    double valorSaq = Double.parseDouble(JOptionPane.showInputDialog("Valor a sacar:"));
                    c.sacar(valorSaq);
                    break;
                case 3:
                    c.imprimirExtrato();
                    break;
                case 4:
                    c.consultarSaldo();
                    break;
                case 0: JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
        while (opcao !=0);
    }
