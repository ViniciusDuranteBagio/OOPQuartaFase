package exercicios;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public void subirDeNivel() {
        this.nivel++;
        System.out.println("O jogador " + nome + " subiu de nível!");
    }
}
