package Pessoa;

public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    protected String getNome() {
        return nome;
    }

    protected int getIdade() {
        return idade;
    }

    public void Apresentar(){
        System.out.println("Olá, meu nome é " + getNome() + " e tenho " + getIdade() + " anos.");
    }
}
