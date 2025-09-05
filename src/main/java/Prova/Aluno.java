package Prova;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + getNome() + " e tenho " + getIdade() + " anos" +
                "\ne minha matricula é " + getMatricula());
    }

}
