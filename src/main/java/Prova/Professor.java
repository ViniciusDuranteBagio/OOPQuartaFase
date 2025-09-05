package Prova;

public class Professor extends  Pessoa{
    private String disciplina;

    public Professor(String nomeInical, int idadeIncial, String disciplinaInicial) {
        super(nomeInical, idadeIncial);
        this.disciplina = disciplinaInicial;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("eu dou aula de "+disciplina);
    }
}
