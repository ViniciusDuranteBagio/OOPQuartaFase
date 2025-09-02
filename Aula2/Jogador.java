package Aula2;
/*Criando uma classe Jogador Crie uma classe Jogador com os atributos nome, pontuacao e nivel.
Crie um metodo subirDeNivel() que aumenta o nível do jogador e imprime "O jogador subiu de nível!".
Instancie dois jogadores e faça um deles subir de nível.*/

public class Jogador {
    String nome;
    int pontuacao;
    int nivel;

    public Jogador(String nome, int pontuacao, int nivel){
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public void subirDeNivel(){
        nivel++;
        System.out.println("O Jogador " + nome + " subiu para o nível " + nivel + "!");

    }

}
