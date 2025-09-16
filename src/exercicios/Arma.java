package exercicios;

public class Arma {
    private String nome;
    private int dano;

    public Arma(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public void usar() {
        System.out.println("A arma foi usada para atacar causando " + dano + " de dano!");
    }
}
