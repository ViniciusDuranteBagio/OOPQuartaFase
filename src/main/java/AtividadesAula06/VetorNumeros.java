package AtividadesAula06;

public class VetorNumeros {
    private int [] vetor;

    public VetorNumeros() {
        vetor = new int[5];
        for ( int i = 0; i < vetor.length; i++) {
            vetor [i] = (i + 1) * 10;
        }
    }

    public int acessar (int indice) throws IndexOutOfBoundsException {
        if (indice < 0 || indice >= vetor.length) {
            throw new IndexOutOfBoundsException("Erro. Informe um valor válido entre 0 e " + (vetor.length - 1));

        }
        return vetor [indice];
    }

}
