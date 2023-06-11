package AtividadePOO5;

import java.util.Date;


public class Emprestimo {
  
    private Pessoa pessoa;
    private Livro livro;
    private Date data;
    
    public Emprestimo (Pessoa pessoa, Livro livro,Date data){
     super();
        this.pessoa = pessoa;
        this.livro = livro;
        this.data = data;
     }
    public Pessoa getPessoa(){
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    public Livro getLivro(){
        return livro;
    }
    public void setLivro (Livro livro){
        this.livro = livro;
    }
    public Date getData(){
        return data;
    }
    public void setDate (Date data){
        this.data = data;
    }
    @Override
    public String toString () {
        return "Emprestimo [pessoa= " +pessoa.getNome() + "\n"
                +"Numero de matricula:" + pessoa.getNumeroMatricula() + "\n"
                +"Curso:" + pessoa.getCurso() + "\n"
                +"Nome do livro:" + livro.getNomeLivro() + "\n"
                +"Autor do livro:" + livro.getAutor() + "\n"
                +"Numero de serie:" + livro.getNumSerie() + "\n"
                +"Data:"+ data + "]";
    }
}
