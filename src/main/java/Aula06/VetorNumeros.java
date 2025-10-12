package Aula06;

import java.util.ArrayList;

public class VetorNumeros {
    private final int[] dados = {10, 20, 30, 40, 50};

    public int get(int indice) {
        if (indice < 0 || indice >= dados.length) {
            throw new IndexOutOfBoundsException("Indice invalido (válido: 0 a " + (dados.length - 1) + ").");
        }
        return dados[indice];
    }
}
