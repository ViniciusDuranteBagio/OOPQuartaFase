package Prova;

public class Animal {
    protected String nome;
    protected int idade;
    protected String raca;

    public Animal(String nome, int idade, String raca){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    void fazerSom() {
        System.out.println("O "+nome+ " que tem " + idade + " anos, da especie: " + raca + ". Fez algum som.");
    }
}
