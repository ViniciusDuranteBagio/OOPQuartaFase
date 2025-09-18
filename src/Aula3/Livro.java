package Aula3;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    // Construtor com todos os atributos
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    // Getters e Setters
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
            System.out.println("Erro: O ano de publicação deve ser maior que zero.");
        }
    }
    
    // Método para exibir detalhes do livro
    public void exibirDetalhes() {
        System.out.println("=== Detalhes do Livro ===");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de Publicação: " + this.anoPublicacao);
        System.out.println("========================");
    }
} 