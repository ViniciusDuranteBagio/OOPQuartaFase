package Prova;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome,int idade,String matricula) {
        super(nome,idade);
        this.matricula = matricula;
    }

    @Override
    public void ExibirDetalhes() {
        System.out.println("Olá, sou " + getNome() + ", tenho " + getIdade1() + " anos e minha matrícula é " + matricula);
    }

    public String getMatricula() {
        return matricula;
    }
}
