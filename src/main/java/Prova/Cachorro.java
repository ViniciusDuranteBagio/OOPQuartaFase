package Prova;

public class Cachorro extends Animal{

    public Cachorro(String nomeInicial, int idadeInicial) {
        super(nomeInicial, idadeInicial);
    }

    @Override
    public void fazerSom() {
        super.fazerSom();
        System.out.println("Au Au Au!");
    }
}
