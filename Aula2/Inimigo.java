package Aula2;
/*Criando uma classe Inimigo
A classe Inimigo deve ter nome, tipo e força.
Crie um metodo atacar() que imprime "O inimigo atacou com força X!", onde X é o valor da força.
Instancie um inimigo e faça ele atacar.*/

public class Inimigo {
    String nome;
    String tipo;
    int forca;

    public Inimigo(String nome, String tipo, int forca){
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
    }

    public void atacar(){
        System.out.println("O inimigo " + nome + " atacou com " + forca + " de força!");
    }
}
