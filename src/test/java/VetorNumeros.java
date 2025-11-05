package org.example;

public class VetorNumeros {
    private int[] numeros = {10, 20, 30, 40, 50};

    public int acessarPosicao(int indice) {
        if (indice < 0 || indice >= numeros.length) {
            throw new ArrayIndexOutOfBoundsException("Índice inválido! Use de 0 a " + (numeros.length - 1));
        }
        return numeros[indice];
    }
}
