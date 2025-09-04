package Prova;

public class Pessoa1 {
    String nome;
    int idade;

    protected Pessoa1(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    protected void apresentar() {
        System.out.println("Olá sou " + nome + ", e tenho " + idade + " anos");

    }
}
