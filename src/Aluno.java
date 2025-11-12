package Aula3;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota;
    
    // Construtor com nome e matrícula
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = 0.0;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double getNota() {
        return nota;
    }
    
    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Erro: A nota deve estar entre 0 e 10.");
        }
    }
    
    // Método para exibir status do aluno
    public void exibirStatus() {
        System.out.println("=== Status do Aluno ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nota: " + this.nota);
        System.out.println("======================");
    }
} 