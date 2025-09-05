package Prova;

public class Aluno extends Pessoa2{
    private int matricula;

    public Aluno(int matriculaAluno) {
        this.matricula = matriculaAluno;
    }
    @Override
    public  void apresentar() {
        System.out.println("Olá sou " + getNome() +  ", tenho " + getIdade() + " anos e minha matricula é " + matricula);
    }
}
