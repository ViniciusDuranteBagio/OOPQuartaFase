package ExerciciosAula3;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota;

    // Construtor
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = 0.0; // Nota inicializada com 0
    }

    // --- Getters ---
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    // --- Setters ---
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Erro: A nota deve estar entre 0 e 10.");
        }
    }

    // --- Método de exibição ---
    public void exibirStatus() {
        System.out.println("--- Status do Aluno ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nota: " + this.nota);
    }
}