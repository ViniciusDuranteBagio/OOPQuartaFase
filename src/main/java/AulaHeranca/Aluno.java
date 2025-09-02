package AulaHeranca;

public class Aluno extends Pessoa {

    String matricula;

    public Aluno (String nome, int idade, String matricula) { // inicia construtor

        super(nome, idade);
        this.matricula = matricula; // inicia matricula

   }

}
