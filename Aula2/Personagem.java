package Aula2;
/* Criando um personagem com classe e objeto
Crie uma classe Personagem com nome, vida e nível.
Crie um metodo mostrarStatus() que imprime as informações do personagem.
Instancie um personagem e mostre seu status.  */
public class Personagem {
    String nome;
    int vida;
    int nivel;

    public Personagem(String nome, int vida, int nivel){
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
    }
    public void mostrarStatus(){
        System.out.println("Informações do Personagem:\nNome: " + nome + "\nVida: " + vida + "\nNível: " + nivel);
    }
}
