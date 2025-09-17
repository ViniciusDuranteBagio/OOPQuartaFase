package Aula1;

public class Jogo {
    int pontuacao;

    public int aumentarPontuacao(int pontos){
        pontuacao += pontos;
        System.out.println(pontuacao + " pontos");
        return pontos;
    }

}
