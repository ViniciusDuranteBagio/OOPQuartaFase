package Prova;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + getNome() + ", tenho " + getIdade() + " anos" +
                "\ne minha disciplina é " + getDisciplina());
    }

}
