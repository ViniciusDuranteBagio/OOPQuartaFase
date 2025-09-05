package Prova;

public class Gato extends Animal {
    public Gato(String nomeInicial, int idadeInicial) {
        super(nomeInicial, idadeInicial);
    }

    @Override
    public void fazerSom() {
        super.fazerSom();
        System.out.println("Miau Miau!");
    }
}
