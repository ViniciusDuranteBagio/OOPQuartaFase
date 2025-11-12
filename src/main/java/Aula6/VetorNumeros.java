package Aula6;

public class VetorNumeros {
    private int[] vetor;

    public VetorNumeros() {
        vetor = new int[5];
    }

    public int getValor(int posicao) throws IndexOutOfBoundsException {
        if (posicao < 0 || posicao > vetor.length) {
            throw new IndexOutOfBoundsException("Posicao invalida. Intervalo entre 0 a" + (vetor.length - 1));
        }
        return vetor[posicao];
    }
    public void setValor(int posicao, int valor) throws IndexOutOfBoundsException {
        if (posicao < 0 || posicao > vetor.length) {
            throw  new IndexOutOfBoundsException("Posicao invalida entre 0 a" + (vetor.length - 1));
        }
        vetor[posicao] = valor;
    }

    public static void main(String[] args) {
        VetorNumeros vetor = new VetorNumeros();

        try {
            vetor.setValor(0, 10);
            vetor.setValor(4, 50);
            System.out.println("Valor no índice 0: " + vetor.getValor(0));
            System.out.println("Valor no índice 4: " + vetor.getValor(4));
            System.out.println("Valor no índice 5: " + vetor.getValor(5));

        }catch (IndexOutOfBoundsException e) {
            System.out.println("Erro ao inserir valor " + e.getMessage());
        }
    }
}
