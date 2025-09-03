package Prova;

public class Aluno extends  Pessoa {
    int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", eu tenho " + idade + " anos" + " e meu código de matrícula é " + matricula);

    }
}
