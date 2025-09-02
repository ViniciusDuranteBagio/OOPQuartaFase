//Exercício 4: Adicionando Métodos em Herança
//Crie uma classe Animal com os atributos nome e idade, além de um método dormir() que imprime "O animal está dormindo".
//Depois, crie uma subclasse Cachorro que adiciona um método latir() imprimindo "O cachorro está latindo".
//No main(), crie um Cachorro, chame dormir() e latir().

//Exercício 5: Protegendo Atributos com protected
//Modifique o exercício anterior e torne os atributos nome e idade protected na classe Animal.
//Depois, crie um método exibirInformacoes() em Animal para exibir nome e idade.
//Na classe Cachorro, crie um método brincar(), que imprime "O cachorro [nome] está brincando!".
//No main(), crie um cachorro e teste os métodos.

package org.example;

public class Animal {

    protected String nome;
    protected int idade;

    public Animal (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void dormir() {
        System.out.println("O " + nome + " esta dormindo");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
    }
}
