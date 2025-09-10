package introducao;

public class jogador {

    String nome;
    double pontuacao;
    int nivel;

    public void subirNivel(){
            nivel ++;
        System.out.println("o jogador " + nome + " subio de nivel " + nivel);

    }
}
