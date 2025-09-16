package Exercicios_Aula1;

public class Heroi {
    String nome;
    String classe;

    public Heroi(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
    }

    public void lutar() {
        System.out.println("O herói " + nome + " (" + classe + ") atacou!");
    }
}
