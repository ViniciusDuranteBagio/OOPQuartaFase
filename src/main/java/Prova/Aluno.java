package Prova;

public class Aluno extends Pessoa {
    protected String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Matricula: " + this.matricula);
    }
}
