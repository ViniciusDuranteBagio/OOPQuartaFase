package org.example;

public class Arma {
    public String nome;
    public int dano;
    
    public void usar() {
        System.out.println("A arma foi usada para atacar causando " + dano + " de dano!");
    }
} 