package ExerciciosAula1;

class Jogo {
    int pontuacao = 0;

    public void aumentarPontuacao(int pontos) {
        this.pontuacao += pontos;
        System.out.println("+" + pontos + " pontos! Pontuação total: " + this.pontuacao);
    }
}