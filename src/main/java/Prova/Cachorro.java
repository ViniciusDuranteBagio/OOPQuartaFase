package Prova;

public class Cachorro extends Animal{

    public Cachorro(String nome, Integer idade) {
        super(nome, idade);
    }

    public void fazerSom(){
        System.out.println("Cachorro " + getNome() + ", " + getIdade() + " anos, fez um AuAu");

    }
}
