package Aula5;

public class Gato extends Animal {
    public Gato(String nome, boolean isVivo, boolean isDoente) {
        super(nome, isVivo, isDoente);
    }

    @Override
    public void fazerSom() {
        System.out.println("miau");
    }
}
