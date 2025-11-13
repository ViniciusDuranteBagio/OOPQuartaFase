package Aula4;

public class Personagem {
    protected String nome;
    protected int nivel;
    
    // Construtor
    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getNivel() {
        return nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nível: " + this.nivel);
    }
} 