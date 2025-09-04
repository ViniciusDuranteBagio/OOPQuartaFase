package Prova;

public class Aluno extends Pessoa{
    private int matricula;

    public Aluno (String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void apresentar() {
        super.apresentar();
        System.out.println("Matrícula: " + matricula);
    }
}
