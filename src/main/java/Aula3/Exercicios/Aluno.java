package Aula3.Exercicios;

public class Aluno {private String nome;
    private String matricula;
    private double nota;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = 0; // nota inicial
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public double getNota() { return nota; }
    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Erro: Nota deve estar entre 0 e 10.");
        }
    }

    public void exibirStatus() {
        System.out.println("Aluno: " + nome + " | Matrícula: " + matricula + " | Nota: " + nota);
}
}