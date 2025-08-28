package org.example;

public class Jogo {
    public int pontuacao = 0;
    
    public void aumentarPontuacao(int pontos) {
        this.pontuacao = this.pontuacao + pontos;
        System.out.println("Pontuação aumentou em " + pontos + " pontos! Total: " + pontuacao);
    }
} 