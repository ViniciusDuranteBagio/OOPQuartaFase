package Exercicios_Aula1;

public class Jogo {
    int pontuacao;

    public void aumentarPontos(int pontos) {
        if (pontos <= 0) {
            System.out.println("Valor inválido!");
            return;
        } else {
            pontuacao += pontos;
            System.out.println("Foram adicionados " + pontos + " pontos à pontuação total!");
            }
        }

    public void exibirPontuacao() {
        System.out.println("Pontuação total: " + pontuacao);
    }
}
