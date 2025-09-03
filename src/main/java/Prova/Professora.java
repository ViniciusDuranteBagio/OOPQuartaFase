package Prova;

public class Professora extends PessoaTreis {
    private String disciplina;

    public Professora(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Eu ensino " + disciplina + ".");
    }
}
