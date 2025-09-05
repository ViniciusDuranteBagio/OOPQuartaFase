package Prova;

public class Aluno extends Pessoa{
    private int matricula;

    public Aluno (String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Minha matricula é " + this.matricula);
    }

}
