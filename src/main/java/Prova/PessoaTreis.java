package Prova;

public class PessoaTreis {

    protected String nome;
    protected int idade;

    public PessoaTreis(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá, sou " + nome + " e tenho " + idade + " anos.");
    }
}