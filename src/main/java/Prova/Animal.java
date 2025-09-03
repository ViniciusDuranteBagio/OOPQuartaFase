package Prova;

public class Animal {

    String nome;
    int idade;

    public Animal (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    } public void exibirDados() {
        System.out.println("Nome: " + nome + "\n" + "Idade: " + idade);

    } public void fazerSom() {
            System.out.println("O animal fez algum som");

    }
}
