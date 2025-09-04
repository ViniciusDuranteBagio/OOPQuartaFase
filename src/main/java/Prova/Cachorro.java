package Prova;

public class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro " + nome + " com idade de " + idade + ", Latiu!");
    }
}
