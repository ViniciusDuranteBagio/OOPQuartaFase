package Prova;

public class Professor extends Pessoa {
    String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", eu tenho " + idade + " anos" + " e a disciplina que leciono é " + disciplina);
    }
}
