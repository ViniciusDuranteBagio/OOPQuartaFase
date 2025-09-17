package Aula1;

public class Personagem {
    String nome;
    int vida;
    int nivel;

    public void mostrarStatus(){
        System.out.println("Nome: " + nome +
                "\nVida: " + vida +
                "\nNível: " + nivel);
    }
}
