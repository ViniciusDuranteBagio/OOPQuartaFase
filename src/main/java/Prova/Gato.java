package Prova;

public class Gato extends Animal{
    @Override
    public void fazerSom() {
        System.out.println("O gato " + nome + " com idade de " + idade + ", Miou!");
    }
}
