package Prova;

public class Gato extends Animal {
    //gato fofinho miando - Questão 7
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println(nomeAnimal + " de " + idadeAnimal + " anos miou: Miau! (iti que fofinho)");
    }
}
