package org.example.aula03;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

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

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao > 0) {
            this.anoPublicacao = anoPublicacao;
        } else {
            System.out.println("Erro! Ano deve ser maior que zero!");
        }
    }

    Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        setAnoPublicacao(anoPublicacao);
    }

    public void exibirDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicacao: " + anoPublicacao);
        System.out.println("-------------------------------------");
    }
}