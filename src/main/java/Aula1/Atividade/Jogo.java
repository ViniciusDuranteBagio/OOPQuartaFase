package Aula1.Atividade;

public class Jogo {
    private int pontuacao;

    public Jogo() {
        this.pontuacao = 0;
    }

    public void aumentarPontuacao(int pontos) {
        this.pontuacao += pontos;
        System.out.println("Pontuação aumentada! Total: " + this.pontuacao);
    }

    public int getPontuacao() {
        return pontuacao;
    }

}
