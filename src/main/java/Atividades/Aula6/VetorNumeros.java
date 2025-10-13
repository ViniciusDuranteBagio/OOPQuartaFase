package Atividades.Aula6;

public class VetorNumeros {
    private int[] numeros;

    public VetorNumeros() {
        this.numeros = new int[5];
    }

    public void setValor(int indice, int valor) {
        if (indice < 0 || indice >= numeros.length) {
            throw new IndexOutOfBoundsException("Índice inválido. O intervalo válido é de 0 a " + (numeros.length - 1) + ".");
        }
        numeros[indice] = valor;
    }
    public int getValor(int indice) {
        if (indice < 0 || indice >= numeros.length) {
            throw new IndexOutOfBoundsException("Índice inválido. O intervalo válido é de 0 a " + (numeros.length - 1) + ".");
        }
        return numeros[indice];
    }
}
