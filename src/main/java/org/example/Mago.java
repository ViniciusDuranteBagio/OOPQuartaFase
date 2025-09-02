//Exercício 9: Criando uma Classe Base para Jogos
//Crie uma classe Personagem com os atributos nome e nivel.Depois, crie duas subclasses:
//Guerreiro, que adiciona forca.
//Mago, que adiciona mana.
//No main(), crie um Guerreiro e um Mago, atribua valores e exiba as informações.

package org.example;

public class Mago extends Personagem {

    private int mana;

    public Mago(String nome, int nivel, String classe, int mana) {
        super(nome, nivel, classe);
        this.mana = mana;
    }

    public void exibirInformacoes() {
        System.out.println("Classe: " + classe +
                "\nNome: " + nome +
                "\nNivel: " + nivel +
                "\nMana: " + mana);
    }
}
