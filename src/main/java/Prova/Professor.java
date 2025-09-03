package Prova;

public class Professor extends PessoaHeranca {
    String disciplina;

    public Professor (String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Sou professor e leciono a disciplina de " + disciplina);
    }
}
