package Aula4;

public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibeInfo() {
        System.out.println("Nome: " + nome +  "\nIdade: " + idade);
    }
}
