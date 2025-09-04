package Pessoa;

public class Professor extends Pessoa {
    private String disciplina;
    public Professor(String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina = disciplina;
    }


    protected String getDisciplina() {
        return disciplina;
    }

    @Override
    public void Apresentar() {
        super.Apresentar();
        System.out.println("Disciplina: " + getDisciplina());
    }
}
