import java.util.Date;
public class biblioteca{
    public abstract class Usuario{
        protected String nome, endereco;
        public Usuario(String nome, String endereco){
            this.nome =  nome;
            this.endereco = endereco;
        }
        public abstract void exibirInfo();
    }
    
    public class Professor extends Usuario{
        private String departamento;
        
        public Professor(String nome, String endereco, String departamento){
            super(nome, endereco);
            this.departamento = departamento;
        }
        @Override
        public void exibirInfo(){
            System.out.println("Professor: "+nome+ ", Departamento: "+departamento);
        }
    }
    
    public class Funcionario extends Usuario{
        private String departamento;
        
        public Funcionario(String nome, String endereco, String departamento){
            super(nome, endereco);
            this.departamento = departamento;
        }
        @Override
        public void exibirInfo(){
            System.out.println("Funcionario: "+nome+ ", Departamento: "+departamento);
        }
    }
    
    public class Aluno extends Usuario{
        public Aluno (String nome, String endereco){
            super(nome, endereco);
        }
        @Override
        public void exibirInfo(){
            System.out.println("Aluno: "+nome);
        }
    }
    
    public class Obras {
        private String titulo, tipo, idioma, midia, autor, nacionalidadeAutor, editora;
        private int anoEdicao;
        
        public Obras(String titulo, String tipo, String idioma, String midia, String nacionalidadeAutor,
                     String autor, String editora, int anoEdicao){
            this.titulo = titulo;
            this.tipo = tipo;
            this.idioma = idioma;
            this.midia = midia;
            this.autor = autor;
            this.nacionalidadeAutor = nacionalidadeAutor;
            this.editora = editora;
            this.anoEdicao = anoEdicao;
        }
        public void exibirInfo(){
            System.out.println("Titulo: "+titulo+", Tipo:"+tipo+", Idioma: "+idioma+", Midia: "+midia+", Autor: "+autor+", Nacionalidade do Autor: "+nacionalidadeAutor+", Editora: "+editora+", Ano de lançamento da edição "+anoEdicao);
        }
    }
    
    
    public class Emprestimo{
        private Usuario usuario;
        private Obras obra;
        private Date dataEmprestimo;
        private Date dataDevolucao;
        
        public Emprestimo(Usuario usuario, Obras obra, Date dataEmprestimo, Date dataDevolucao){
            this.usuario = usuario;
            this.obra = obra;
            this.dataEmprestimo = dataEmprestimo;
            this.dataDevolucao = dataDevolucao;
        }
        public void exibirEmprestimo(){
            System.out.println("Usuario: "+usuario.nome+" emprestou: "+obra.titulo);
        }
    }
}
