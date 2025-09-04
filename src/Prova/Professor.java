package Prova;

public class Professor extends Pessoa2 {
    String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá sou " + nome + ", e tenho " + idade + " anos");
        System.out.println("Disciplia: " + disciplina);
    }
}
