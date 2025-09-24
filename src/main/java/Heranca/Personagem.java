package Heranca;

public class Personagem {
    protected String nome;
    protected int nivel;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Nível: " + nivel);
    }
}
