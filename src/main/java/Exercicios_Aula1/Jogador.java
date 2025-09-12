package Exercicios_Aula1;

public class Jogador {
    String nome;
    double pontuacao;
    int nivel;

    public void subirDeNivel() {
        nivel++;
        System.out.println("O jogador subiu de nível!\nNível: " + nivel);
    }
}
