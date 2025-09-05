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

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }


    @Override
    public void apresentar() {
        System.out.println("Olá, sou " + getNome() + ", tenho " + getIdade() + " anos e leciono " + disciplina + ".");
    }}