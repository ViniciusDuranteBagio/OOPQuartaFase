package Prova;

public class Professor extends Pessoa{
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina=disciplina;
    }

    public String getDiciplina() {
        return disciplina;
    }

    public void setDiciplina(String diciplina) {
        this.disciplina = diciplina;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Minha disciplina é " +disciplina);
    }
}
