package Prova;

public class Cachorro extends Animal{

    public Cachorro (String nome, int idade, String raca){
        super(nome, idade, raca);
    }

    @Override
    void fazerSom(){
        System.out.println("O "+nome+ " que tem " + idade + " anos, da especie: " + raca + ". Fez auau.");
    }


}
