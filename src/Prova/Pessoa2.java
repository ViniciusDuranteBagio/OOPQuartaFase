package Prova;

public class Pessoa2 {
    protected String nome;
    protected int idade;

    // Construtor
    public Pessoa2(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá sou " + nome + ", e tenho " + idade + " anos");
    }
}