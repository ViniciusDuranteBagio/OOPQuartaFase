package classe.src.Exercicio_Aula_2;

public class Livro {

    private String titulo;
    private String autor;
    private int anopublicacao;

    public Livro(String titulo,String autor, int anopublicacao){
        this.titulo=titulo;
        this.autor=autor;
        this.anopublicacao=anopublicacao;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnopublicacao() {
        return anopublicacao;
    }

    public void setAnopublicacao(int anopublicacao) {
        if (anopublicacao>0) {
            this.anopublicacao = anopublicacao;
            System.out.println("O ano foi editado para " + anopublicacao);
        }else {
            System.out.println("Ano precisa ser maior que Zero");
        }
    }


    public void ExibirInformacoes(){
        System.out.println("//// DADOS /////");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicacao: " + anopublicacao);
    }
}
