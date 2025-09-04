package Prova;

public class Animal {
    String nomeAnimal;
    int idadeAnimal;

    public Animal(String nome, int idade) {
        this.nomeAnimal = nome;
        this.idadeAnimal = idade;
    }

    public void fazerSom() {
        System.out.println(nomeAnimal + " de " + idadeAnimal + " anos fez algum som, com certeza chato e que acordou a vizinhança.");
    }
}
