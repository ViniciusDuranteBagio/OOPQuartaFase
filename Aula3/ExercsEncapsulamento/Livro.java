package ExercsEncapsulamento;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro (String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao >0) {
            this.anoPublicacao = anoPublicacao;
        } else {
            System.out.println("ERRO!ANO DE PUBLICAÇÃO PRECISA SER MAIOR QUE 0!");
        }
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    void exibirDetalhes() {
        System.out.println("Livro: " + titulo + "\nAutor: " + autor + "\nAno de publicação: " + anoPublicacao);
    }

}