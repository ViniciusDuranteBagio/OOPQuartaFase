package Prova;

public class Animal {
    String nome;
    int idade;
    String som;

    protected Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    protected void fazerSom(String som) {
        this.som = som;
        System.out.println("O " + nome + " tem " + idade + " anos" + som );
    }
}
