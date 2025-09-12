package Exercs;

public class Jogo {

    int pontuacao;

    void aumentarPontuacao(int pontos) {
        pontuacao = pontos + pontuacao;
        System.out.println("Sua pontuação é de: " + pontuacao);
    }
}