package Prova;

public class Cachorro extends Animal {
    public Cachorro(String nome3, int idade3) {
        super(nome3, idade3);
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome3() + ", " + getIdade() + " anos, está latindo: salsicha auauauau!");
    }

}