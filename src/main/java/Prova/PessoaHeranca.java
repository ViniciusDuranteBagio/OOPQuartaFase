package Prova;

public class PessoaHeranca {

    String nome;
    int idade;

    public PessoaHeranca (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void apresentar() {
        System.out.println("Olá, sou " + nome + " e tenho " + idade + " anos.");

    }
}
