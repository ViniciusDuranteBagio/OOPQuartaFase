package Prova;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    public Pessoa() {
    }

    public void Apresentar(){
        System.out.println("Olá, meu nome é " + this.nome + " e tenho " + this.idade + " anos!");

    }

}
