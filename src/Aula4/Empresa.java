package Aula4;

public class Empresa {
    protected String nome;
    protected String cidade;
    
    // Construtor
    public Empresa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    // Método para exibir dados
    public void exibirDados() {
        System.out.println("Nome da Empresa: " + this.nome);
        System.out.println("Cidade: " + this.cidade);
    }
} 