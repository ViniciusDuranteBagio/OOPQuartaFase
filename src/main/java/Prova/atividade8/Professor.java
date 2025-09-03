package atividade8;

public class Professor extends Pessoa{
    String disciplina;

    @Override
    public void apresentar() {
    super.apresentar();
        System.out.println("disciplina " + disciplina);
    }
}