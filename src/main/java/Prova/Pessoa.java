package Prova;

public class Pessoa {
    //Crie uma classe chamada Pessoa com os atributos nome e idade, e um método apresentar() que imprime:
    //“Olá, meu nome é <nome> e tenho <idade> anos.”
    //(Não pediu pra atribuir nenhum valor)

    String nomePessoa;
    int idadePessoa;

    public Pessoa(String nome, int idade) {
        this.nomePessoa = nome;
        this.idadePessoa = idade;
    }

    void apresentar() {
        System.out.println("Olá, meu nome é " + nomePessoa + " e tenho " + idadePessoa + " anos.");
    }
}