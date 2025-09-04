package Prova;

public class Aluno extends Pessoa{
private String matricula;

    public Aluno(String nome, int idade, String matricula){
        super(nome,idade);
        this.matricula = matricula;
    }

    public String getMatricula(){
        return matricula;
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o aluno " + getNome() + ", tenho " + idade + " anos, inscrito na matricula: " + matricula);
    }
}
