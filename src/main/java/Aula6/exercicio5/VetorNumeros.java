package Aula6.exercicio5;

public class VetorNumeros {
    private int[] numeros = {10, 20, 30, 40, 50};

    public int acessar(int indice) throws IndexOutOfBoundsException {
        if (indice < 0 || indice >= numeros.length)
            throw new IndexOutOfBoundsException("Índice inválido! Use de 0 a " + (numeros.length - 1));
        return numeros[indice];
    }
}
