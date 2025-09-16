package exercicios;

public class Monstro {
    private String nome;
    private int vida;

    public Monstro(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void rugir() {
        System.out.println("O monstro rugiu!");
    }
}
