package exercicios;

public class Jogo {
    private int pontuacao = 0;

    public void aumentarPontuacao(int pontos) {
        this.pontuacao += pontos;
    }

    public void exibirPontuacao() {
        System.out.println("Pontuação total: " + pontuacao);
    }
}
