package Aula2;
/*Criando uma classe Arma
A classe Arma deve ter os atributos nome e dano.
Crie um metodo usar() que imprime "A arma foi usada para atacar causando X de dano!", onde X é o dano da arma.
Instancie uma arma e chame o metodo usar().  */

public class Arma {
    String nome;
    int dano;

    public Arma(String nome, int dano){
        this.nome = nome;
        this.dano = dano;
    }
    public void usar(){
        System.out.println("A arma " + nome + " foi usada para atacar, causando " + dano + " de dano!");
    }
}
