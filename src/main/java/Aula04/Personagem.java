package Aula04;

public class Personagem {
    protected String nome;
    protected int nivel;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void imprimirInfoPersonagem() {
        System.out.println("Nome do personagem: " + this.nome);
        System.out.println("Nivel do personagem: " + this.nivel);
    }
}
