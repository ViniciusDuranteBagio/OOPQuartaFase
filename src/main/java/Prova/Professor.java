package Prova;

public class Professor extends Pessoa{
    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor (String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("minha disciplina é " + disciplina);
    }
}
