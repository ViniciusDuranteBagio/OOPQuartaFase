package Prova;

public class Pessoa {
    String nome;
    int idade;

    protected Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    protected void Apresentar() {
        System.out.println("Olá meu nome é " + nome + " e tenho " + idade + " anos");
    }

}
