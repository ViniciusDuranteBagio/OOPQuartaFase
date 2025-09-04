package Prova;

public class Animal {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void metodoSom() {
        System.out.println(nome + " (" + idade + " anos) fez algum som auauau!");
    }
}