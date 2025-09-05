package Prova;

public class Pessoa2 {

    protected String nome;
    protected int idade;

    public Pessoa2(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar() {
        System.out.println("Olá sou, " + nome + " e tenho " + idade + " anos.");
    }

}
