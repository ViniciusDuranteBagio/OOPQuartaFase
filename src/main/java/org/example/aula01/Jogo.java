package org.example.aula01;

public class Jogo {
    int pontuacao;

    public void aumentarPontuacao(int pontos) {
        this.pontuacao = pontuacao + pontos;
        System.out.println("Pontuacao: " + pontuacao);
    }
}