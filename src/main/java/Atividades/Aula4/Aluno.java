package Atividades.Aula4;

public class Aluno extends Pessoa {
    String matricula;

    Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
}
