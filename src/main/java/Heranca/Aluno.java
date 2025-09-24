package Heranca;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade); // chama o construtor da classe Pessoa
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + getNome() + ", idade=" + getIdade() + ", matricula=" + matricula + "]";
    }
}
