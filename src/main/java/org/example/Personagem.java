//Exercício 9: Criando uma Classe Base para Jogos
//Crie uma classe Personagem com os atributos nome e nivel.Depois, crie duas subclasses:
//Guerreiro, que adiciona forca.
//Mago, que adiciona mana.
//No main(), crie um Guerreiro e um Mago, atribua valores e exiba as informações.

package org.example;

public class Personagem {

    protected String nome;
    protected int nivel;
    protected String classe;

    public Personagem(String nome, int nivel, String classe) {
        this.nome = nome;
        this.nivel = nivel;
        this.classe = classe;
    }
}
