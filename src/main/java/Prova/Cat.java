package Prova;

public class Cat extends Animal {
    public Cat(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void fazerSom() {

        System.out.println(getNome() + "AAAAAAAAAAAAA");
    }
}
