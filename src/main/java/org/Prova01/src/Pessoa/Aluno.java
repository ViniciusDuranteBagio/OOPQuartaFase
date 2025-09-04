package Pessoa;

public class Aluno extends Pessoa{
    int matricula;

    public Aluno(String nome, int idade, int matricula){
        super(nome, idade);
    }

    private int getMatricula() {
        return matricula;
    }

    @Override
    public void Apresentar() {
        super.Apresentar();
        System.out.println("Matrícula: " + getMatricula());
    }
}
