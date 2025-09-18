package ExerciciosAula4;

// Usada nos exercícios 4 e 5
public class Animal {
    // protected: acessível na mesma classe e em subclasses
    protected String nome;
    protected int idade;

    public void dormir() {
        System.out.println("O animal está dormindo.");
    }

    // Método para o Exercício 5
    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}