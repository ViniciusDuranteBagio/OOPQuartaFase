package Aula2;
/*Criando um sistema de pontuação
Crie uma classe Jogo que tenha um atributo pontuacao.
Crie um metodo aumentarPontuacao(int pontos) que soma pontos à pontuação total.
 Instancie um jogo e aumente a pontuação três vezes.*/

public class Jogo {
    int pontuacao;
    public Jogo(int pontuacao){
        this.pontuacao = pontuacao;
    }
    public void aumentarPontuacao(int pontos){
        pontuacao += pontos;
        System.out.println("Pontuação atual: " + pontuacao);

    }
}
