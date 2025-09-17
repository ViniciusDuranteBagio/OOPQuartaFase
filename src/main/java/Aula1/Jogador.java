package Aula1;

public class Jogador {
    String nome;
    int pontuacao;
    int nivel;

    public void subirNivel(){
        nivel++;
        System.out.println("O jogador " + nome + " subiu de nível!");
    }
}
