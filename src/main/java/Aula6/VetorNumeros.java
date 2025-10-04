package Aula6;

public class VetorNumeros {
    private int[] vetor;

    public VetorNumeros() {
        vetor = new int[5];
    }

    public int getValor(int indice) throws IndexOutOfBoundsException {
        if (indice < 0 || indice >= vetor.length) {
            throw new IndexOutOfBoundsException("Índice inválido. Intervalo válido: 0 a " + (vetor.length - 1));
        }
        return vetor[indice];
    }

    public void setValor(int indice, int valor) throws IndexOutOfBoundsException {
        if (indice < 0 || indice >= vetor.length) {
            throw new IndexOutOfBoundsException("Índice inválido. Intervalo válido: 0 a " + (vetor.length - 1));
        }
        vetor[indice] = valor;
    }
}
