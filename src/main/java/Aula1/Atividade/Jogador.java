package Aula1.Atividade;

public class Jogador {
    public String nome;
    public int pontuacao;
    public int nivel;

    public void subirDeNivel() {
        int subirNivel = nivel + 1;
        System.out.println("O jogador " + nome + " subiu de nível!");

    }

}
