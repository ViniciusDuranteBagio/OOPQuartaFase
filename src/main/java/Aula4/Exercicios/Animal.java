package Aula4.Exercicios;
public class Animal {
    public String nome;
    public int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
}

    public void dormir() {
        System.out.println("O animal está dormindo.");
}

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " | Idade: " + idade);
    }
}