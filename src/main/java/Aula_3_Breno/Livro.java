package Aula_3_Breno;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public void Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao > 0) {
            this.anoPublicacao = anoPublicacao;
        } else {
            System.out.println("Ano invalido");
        }
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nAno de publicacao: " + anoPublicacao);
    }
}