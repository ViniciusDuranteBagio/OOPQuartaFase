package Aula4;

public class Animal {

    //atributos da classe animal
    protected String nome;
    protected int idade;

    //construtor da classe

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //metodos getter para puxar os dados na main


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    //metodo dormir
    public void dormir(){
        System.out.println("O animal está dormindo.");
    }

    //criacao do metodo do exercício 5
    //metodo exbirInformacoes
    public void exibirInformacoes(){
        System.out.println("Nome do animal: " + getNome() + "\nIdade: " + getIdade());
    }
}
