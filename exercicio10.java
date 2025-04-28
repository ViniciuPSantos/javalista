import javax.swing.JOptionPane;

public class Pessoa {
    String nome;
    int idade;

    // Método para exibir os dados da pessoa
    void exibirDados() {
        String msg = "Nome: " + nome + "\nIdade: " + idade;
        JOptionPane.showMessageDialog(null, msg);
    }

    // Classe Aluno, que herda de Pessoa
    public class Aluno extends Pessoa {
        int numeroMatricula, nota1, nota2;
        double media;
        String curso, disciplina;

        @Override
        void exibirDados() {
            String msg = "Nome: " + nome + "\nIdade: " + idade + "\nNúmero de Matrícula: " + numeroMatricula + 
                         "\nCurso: " + curso + "\nDisciplina: " + disciplina + "\nNotas: " + nota1 + " e " + nota2;
            JOptionPane.showMessageDialog(null, msg);
        }

        void calcularMedia() {
            media = (nota1 + nota2) / 2.0; // Corrigindo a fórmula da média
            if (media >= 7) {
                JOptionPane.showMessageDialog(null, "Aprovado com média: " + media);
            } else {
                JOptionPane.showMessageDialog(null, "Reprovado com média: " + media);
            }
        }
    }

    // Método principal para interagir com o usuário
    public static void main(String[] args) {
        // Criação do objeto Aluno
        Pessoa p = new Pessoa();
        Pessoa.Aluno aluno = p.new Aluno();  // Instanciando a classe Aluno dentro de Pessoa

        // Coletando dados do aluno
        aluno.nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        aluno.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno:"));
        aluno.numeroMatricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de matrícula:"));
        aluno.curso = JOptionPane.showInputDialog("Digite o curso do aluno:");
        aluno.disciplina = JOptionPane.showInputDialog("Digite a disciplina do aluno:");
        aluno.nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 1:"));
        aluno.nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 2:"));

        // Exibindo os dados coletados
        aluno.exibirDados();
        
        // Calculando e exibindo a média
        aluno.calcularMedia();
    }
}
