package classe.src.Exercicio_Aula_1;

public class Jogador {
    String nome;
    double pontuacao;
    int nivel=0;

    void subirdenivel(){
        this.nivel +=1;
        System.out.println("O jogador subiu de nível! " + " nivel Atual " + nivel);

    }

}
