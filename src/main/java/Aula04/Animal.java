package Aula04;

public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void dormir() {
        System.out.println("O animal esta dormindo.");
    }
    public void exibirInfoAnimal() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
