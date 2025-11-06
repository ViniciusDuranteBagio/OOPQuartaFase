package Aula8;

public class ExPessoa {

    private String nome;
    private int idade;
    public ExPessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public boolean isAdult() {
        return this.idade >= 20;
    }
}
