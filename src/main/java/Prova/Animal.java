package Prova;

public class Animal {

    String nome;
    int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    public Animal() {
    }

    public void FazerSom(){
        System.out.println(nome + " " + idade + " anos, fez algum som: Auau" );


    }
}

