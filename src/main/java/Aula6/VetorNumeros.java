public class VetorNumeros {
    private int[] vetor = new int[5];
    public int acessar(int indice) {
        if (indice < 0 || indice >= vetor.length)
            throw new ArrayIndexOutOfBoundsException("Índice inválido! Intervalo 0 a 4.");
        return vetor[indice];
    }
}