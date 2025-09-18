package Aula4.Exercicios;

public class Personagem {
    public String nome;
    public int nivel;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " | Nível: " + nivel);
    }
}
