package Prova;

public class Gato extends AnimalDois {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " diz: Miau!");
    }
}
