package Prova;

public class Aluno extends Pessoa2{

    private int matricula;

    public Aluno(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override

    void apresentar(){
        super.apresentar();
        System.out.println("Matricula: " + matricula);
    }
}
