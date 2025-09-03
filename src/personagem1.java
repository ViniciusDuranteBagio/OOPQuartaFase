package org.example;
/*
 Exercício 9: Criando uma Classe Base para Jogos

    Crie uma classe Personagem com os atributos nome e nivel.Depois, crie duas subclasses:

    Guerreiro, que adiciona forca.

            Mago, que adiciona mana.

            No main(), crie um Guerreiro e um Mago, atribua valores e exiba as informações.
 */
public class personagem1 {
    public String nome;
    public int nivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
