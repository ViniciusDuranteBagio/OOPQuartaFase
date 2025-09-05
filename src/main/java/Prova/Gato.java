package Prova;

public class Gato extends Animal{

    public Gato(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void fazerSom(){
        System.out.println("O gato " + getNome() + " de " + getIdade() + " anos de idade, fez Miau - Miau!");
    }
}
