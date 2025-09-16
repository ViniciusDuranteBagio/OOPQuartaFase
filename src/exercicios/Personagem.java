package exercicios;

public class Personagem {
    private String nome;
    private int vida;
    private int nivel;

    public Personagem(String nome, int vida, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
    }

    public void mostrarStatus() {
        System.out.println("Nome: " + nome + ", Vida: " + vida + ", Nível: " + nivel);
    }
}
