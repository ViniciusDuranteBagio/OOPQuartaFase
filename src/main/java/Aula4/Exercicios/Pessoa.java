package Aula4.Exercicios;

public class Pessoa {public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " | Idade: " + idade);
    }
}