package Prova;

public class Animal {
    String nome;
    int idade;

    public Animal (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerSom() {
        System.out.println("O animal " + nome + " tem " + idade + " anos, e fez algum som.");
    }
}
