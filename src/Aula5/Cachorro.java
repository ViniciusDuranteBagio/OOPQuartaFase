package Aula5;

public class Cachorro extends Animal {
    public Cachorro(String nome, boolean isVivo, boolean isDoente) {
        super(nome, isVivo, isDoente);
    }

    @Override
    public void fazerSom() {
        System.out.println("auau");
    }
}
