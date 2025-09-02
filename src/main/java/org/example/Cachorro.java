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

public class Cachorro extends Animal {

    public Cachorro (String nome, int idade) {
        super(nome, idade);
    }

    public void latir() {
        System.out.println("O " + nome + " esta latindo");
    }

    public void brincar() {
        System.out.println("O " + nome + " esta brincando");
    }
}
