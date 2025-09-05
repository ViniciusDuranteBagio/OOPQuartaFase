package Prova;

public class Gato extends Animal{

    public Gato(String nome, int idade, String raca){
        super(nome, idade, raca);
    }

    @Override
    void fazerSom(){
        System.out.println("O "+nome+ " que tem " + idade + " anos, da especie: " + raca + ". Fez miau miau.");
    }
}
