package Prova;

public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
    public void fazerSom(){
        System.out.println(nome+", que tem "+idade+" anos, fez algum som");
    }
}
