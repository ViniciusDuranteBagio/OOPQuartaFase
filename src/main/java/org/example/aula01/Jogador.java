package org.example.aula01;

public class Jogador {
    String nomeJogador;
    int pontuacaoJogador;
    int nivelJogador = 0;

    public void subirDeNivel () {
        nivelJogador += 1;
        System.out.println("O jogador " + nomeJogador + " subiu de nivel! \n" + "Nivel: " + nivelJogador);

    }
}