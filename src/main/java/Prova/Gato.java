package Prova;

public class Gato  extends Animal{
    protected Gato(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    protected void fazerSom(String som) {
        System.out.println("O " + nome + " tem " + idade + " anos" + som);
    }}
