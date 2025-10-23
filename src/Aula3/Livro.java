package Aula3;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        super();
        this.titulo = titulo;
        this.autor = autor;
        this.setAnoPublicacao(anoPublicacao);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao > 0) {
            this.anoPublicacao = anoPublicacao;
        } else {
            System.out.println("Ano de publicacao invalido!");
        }

    }

    public void exibirDetalhes() {
        System.out.println("T\u00edtulo: " + this.titulo + ", Autor: " + this.autor + ", Ano: " + this.anoPublicacao);
    }
}