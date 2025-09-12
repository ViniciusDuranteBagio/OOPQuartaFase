package Exercs;

public class Jogador {

    String nomeJogador;
    int pontuacao;
    int nivel;

    void subirDeNivel(){
        nivel= nivel + 1;
        System.out.println("O " + nomeJogador + " passou para o nível: " + nivel);
    }

}
