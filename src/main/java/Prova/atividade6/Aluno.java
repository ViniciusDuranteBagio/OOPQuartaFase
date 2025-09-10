package atividade6;

public class Aluno extends Pessoa{
    int matricula;

    @Override

    public void apresentar(){
        super.apresentar();
        System.out.println("matricula " + matricula);
    }
}
