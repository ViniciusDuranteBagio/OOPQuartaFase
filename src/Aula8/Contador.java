package Aula8;

public class Contador {
    private int numeroInicial;
    private int contagem;

    public Contador(int numeroInicial) {
        this.numeroInicial = numeroInicial;
    }

    public int incrementar(int contagem) {
        numeroInicial += contagem;
        return numeroInicial;
    }
}
