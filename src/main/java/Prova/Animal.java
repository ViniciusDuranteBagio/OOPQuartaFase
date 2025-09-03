package Prova;

public class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerSom() {
        System.out.println(nome + " de " + idade + " anos fez algum som!");
    }
}
