package Aula6;

class VetorNumeros {
    private int[] numeros;

    public VetorNumeros() {
        numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (i + 1) * 10;
        }
    }

    public int getValor(int indice) throws IndexOutOfBoundsException {
        return numeros[indice];
    }

    public int getTamanho() {
        return numeros.length;
    }
}