package Prova;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void fazerSom(){
        System.out.println("O animal " + getNome() + " de " + getIdade() + " anos de idade, fez algum som.");
    }
}
