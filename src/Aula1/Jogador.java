package Aula1;

public class Jogador {
    public String nome;
    public int pontuacao;
    public int nivel;
    
    public void subirDeNivel() {
        this.nivel++;
        System.out.println("O jogador subiu de nível!");
    }
} 