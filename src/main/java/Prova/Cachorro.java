package Prova;

public class Cachorro extends Animal{
    @Override
    public void fazerSom() {
        System.out.println(nome + " de " + idade + " anos está latindo: Au Au!");
    }
}
