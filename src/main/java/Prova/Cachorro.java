package Prova;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("O cachorro " + getNome() + " tem " + getIdade() + " anos e está latindo.");
    }
}
