package Aula6;
/*Crie um vetor com 5 posições. Permita que o usuário informe um índice.
Se for inválido, trate o erro e mostre intervalo válido. Classes a criar:
VetorNumeros (encapsula o vetor e metodo de acesso).
 */
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
