package Prova;

public class Animal {
    String nome;
    int idade;

    public Animal(String nomeAnimal, int idadeAnimal) {
        this.nome = nomeAnimal;
        this.idade = idadeAnimal;
    }

    public void fazerSom() {
        System.out.println("O animal " + nome + " de " + idade + " anos, fez algum som!");
    }
}
