package org.example.aula01;

public class Arma {
    String nomeArma;
    int danoArma = 100;

    public void usar() {
        System.out.println("A arma foi usada para atacar causando " + danoArma + " de dano!");
    }
}