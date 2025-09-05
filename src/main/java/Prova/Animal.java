package Prova;

public class Animal {

    String nome;
    int idade;

    public Animal(String N, int A) {
        nome = N;
        idade = A;
    }

    public Animal() {
    }

    void fazerSom() {
        System.out.println(nome + ", idade " + idade + ", fez algum som.");
    }
    }
