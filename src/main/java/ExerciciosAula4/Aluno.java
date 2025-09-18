package ExerciciosAula4;

// Usada nos exercícios 1 e 2
public class Aluno extends Pessoa {
    String matricula;

    // Construtor para o Exercício 2
    public Aluno(String nome, int idade, String matricula) {
        // Chama o construtor da superclasse (Pessoa)
        super(nome, idade);
        this.matricula = matricula;
    }
}
