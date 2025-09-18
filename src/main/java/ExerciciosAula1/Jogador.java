package ExerciciosAula1;

class Jogador {
    String nome;
    int pontuacao;
    int nivel;

    public void subirDeNivel() {
        this.nivel++;
        System.out.println("O jogador " + this.nome + " subiu para o nível " + this.nivel + "!");
    }
}
