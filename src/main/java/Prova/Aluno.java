package Prova;

public class Aluno extends Pessoa{
    private String matricula;


    public Aluno(String nome, int idade) {
        super(nome, idade);
    }

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;

    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Matrícula: " + this.matricula);
    }



}
