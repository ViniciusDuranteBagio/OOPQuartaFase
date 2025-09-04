package Prova;

public class Cachorro extends Animal {


    protected Cachorro(String nome, int idade) {
        super(nome, idade);

    }
    @Override
    protected void fazerSom(String som){
        System.out.println("O " + nome + " tem " + idade + " anos" + " auau");
    }}