package exercicios;

public class Inimigo {
    private String nome;
    private String tipo;
    private int força;

    public Inimigo(String nome, String tipo, int força) {
        this.nome = nome;
        this.tipo = tipo;
        this.força = força;
    }

    public void atacar() {
        System.out.println("O inimigo atacou com força " + força + "!");
    }
}
