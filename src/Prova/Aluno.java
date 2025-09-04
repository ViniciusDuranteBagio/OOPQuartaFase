package Prova;

public class Aluno extends Pessoa2{
    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá sou " + nome + ", e tenho " + idade + " anos");
        System.out.println("Matrícula: " + matricula);
    }
}