package org.example.aula01;

public class Inimigo {
    String nomeInimigo;
    String tipo;
    int forca = 77;

    public void atacar() {
        System.out.println("O " + nomeInimigo + " atacou com forca " + forca + "!");
    }
}