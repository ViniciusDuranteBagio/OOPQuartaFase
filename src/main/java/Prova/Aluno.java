package Prova;

public class Aluno extends Pessoa{
    private int matricula;
    public Aluno(String nome, int idade, int matricula){
        super(nome,idade);
        this.matricula=matricula;
    }
    @Override
    public void apresentar(){
        System.out.println("Ola, meu nome é "+nome+" e tenho "+idade+" anos, meu código de matrícula é "+matricula);
    }
}
