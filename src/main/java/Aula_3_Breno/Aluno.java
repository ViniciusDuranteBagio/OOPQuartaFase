package Aula_3_Breno;

public class Aluno {

    private String nome;
    private int matricula;
    private int nota;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(int matricula) {
        if (matricula > 0) {
            this.matricula = matricula;
        } else {
            System.out.println("Matricula invalida");
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setNota(int nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota invalida");
        }
    }

    public int getNota() {
        return nota;
    }

    public void exibirStatus(){
        System.out.println("Nome: " + nome + "\nMatricula: " + matricula + "\nNota: " + nota);
    }
}