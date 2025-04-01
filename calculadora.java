
package com.mycompany.lista;
import javax.swing.JOptionPane;
public class calculadora {
    public static void main(String[] args) {
        int qualOperacao;
        qualOperacao=Integer.parseInt(JOptionPane.showInputDialog("Qual operação você deseja realizar? [1} soma  [2] subtração  [3] divisão  [4] multiplicação. Caso deseje calcular a área de uma figura digite [5]"));
        if (qualOperacao == 1){
            double valor1, valor2, soma;
            valor1=Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor"));
            valor2=Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor"));
            soma=(valor1+valor2);
            JOptionPane.showMessageDialog(null,"O resultado da soma é "+soma);
                              }
        else if (qualOperacao == 2){
            double valor1, valor2, subtracao;
            valor1=Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor"));
            valor2=Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor"));
            subtracao=(valor1-valor2);
            JOptionPane.showMessageDialog(null, "O resultado da subtração é " +subtracao);
                                   }
        else if (qualOperacao == 3){
            double valor1, valor2, divisao;
            valor1=Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor"));
            valor2=Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor"));
            divisao=(valor1/valor2);
            JOptionPane.showMessageDialog(null,"O resultado da divisão é "+divisao);
                                   }
        else if (qualOperacao == 4){
            double valor1, valor2, multiplicacao;
            valor1=Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor"));
            valor2=Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor"));
            multiplicacao=(valor1*valor2);
            JOptionPane.showMessageDialog(null, "O resultado da multiplicação é "+multiplicacao);
                                   }
        else if (qualOperacao == 5){
            int areas;
            double area1, area2, area3;
            double raio, altura, base, lado;
            areas=Integer.parseInt(JOptionPane.showInputDialog("Escolha a area a ser calculada [1] ciruclo  [2] triangulo  [3] quadrado"));
            if (areas == 1){
                raio=Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio"));
                area1=(3.14 * (Math.pow (raio,2)));
                JOptionPane.showMessageDialog(null, "A area do circulo é "+area1);
            }
            else if (areas == 2){
                base=Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base"));
                altura=Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura"));
                area2=(base*altura/2);
                JOptionPane.showMessageDialog(null, "A area do triangulo é "+area2);
            }
            else if (areas == 3){
                lado=Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do lado"));
                area3=(lado*lado);
                JOptionPane.showMessageDialog(null, "A area do quadrado é "+area3);
            }}
                
        else {
            JOptionPane.showMessageDialog(null, "Digite um valor ");
        }
    }
    
}

