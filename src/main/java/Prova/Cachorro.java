package Prova;

public class Cachorro extends Animal {
    public  Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + ", " + getIdade() + " anos, está latindo: Pit Bull Au Au!");
}}