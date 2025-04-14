public class exercicio1 {
    public class Aluno {
         String nome, curso, universidade;
         int idade, matricula;
    
         void estudar(){
            // ação de estudar
        }
        void fazerLogin(){
         // fazer login no site da universidade
        }
        void fazerProva(){
            //realizar provas feitas pelo professor
        }
        void verNota(){
            //ver resultados de provas e trabalhos
        }
    }
    public class Professor {
        String nome, departamento, titulacao, cpf;
        double salario;
        
        void darAula(){
            //dar aula para os alunos
        }
        void aplicarProvas(){
            //aplica provas para os alunos
        }
        void corrigirProva(){
            // corrige provas de alunos
        }
        void lancarNota(){
            // lança nota dos alunos no sistema
        }         
    }
    public class Paciente {
        String nome, cpf, convenio, email, telefone, sexo, dataNascimento, tipoSanguineo;
        int idade;
        
        void marcarConsulta(String data, String medico){
            // marcar consultas
        }
        void cancelarConsulta(String data){
            // cancelar consultas
        }
        void atualizarDadosPessoais (String novoEmail, String novoTelefone){
            // atualizar dados cadastrais
        }
        void exibirHistoricoMedico(){
            // exibe o historico medico dos ultimos meses
        }
    }
}
