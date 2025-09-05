package Prova;

public class Professor extends Pessoa{

    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public void apresentar() {
        System.out.println("Olá meu nome é " + getNome() + " e tenho " + getIdade() + " anos. Eu ensino a matéria de " + disciplina);
    }
}
