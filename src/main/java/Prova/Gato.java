package Prova;

public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " (gato) está miando: Miau!");
    }
}
