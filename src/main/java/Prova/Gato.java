package Prova;

public class Gato extends Animal{
    public Gato(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("O gato " + getNome() + " tem " + getIdade() + " anos e está miando.");
    }
}
