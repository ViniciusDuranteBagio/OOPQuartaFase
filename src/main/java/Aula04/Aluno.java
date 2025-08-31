package Aula04;

public class Aluno extends Pessoa {
    protected int matricula;

    public Aluno(String nome, int idade,  int matricula) {
        super(nome, idade); // chama o construtor da classe Pessoa
        this.matricula = matricula;
    }
    public void imprimirInfoAluno() {
        imprimirInfoPessoa();
        System.out.println("Matricula: " + this.matricula);
    }
}
