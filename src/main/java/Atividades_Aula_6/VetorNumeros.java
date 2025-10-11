package Atividades_Aula_6;

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

    public static void main(String[] args) {
        VetorNumeros vetor = new VetorNumeros();
        try {
            vetor.setValor(0, 10);
            vetor.setValor(4, 50);
            System.out.println("Valor no índice 0: " + vetor.getValor(0));
            System.out.println("Valor no índice 4: " + vetor.getValor(4));
            System.out.println("Valor no índice 5: " + vetor.getValor(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
