package Aula6atv;

public class VetorNumeros {
    private int numeros[] = {1,2,3,4,5};

    public int getValor(int indice) throws ArrayIndexOutOfBoundsException {
        return numeros[indice];
    }

    public int getTamanho() {
        return numeros.length;
    }
}
