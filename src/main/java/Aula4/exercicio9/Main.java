package Aula4.exercicio9;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Zack", 50, 80);
        Mago mago = new Mago("Aerith", 45, 75);

        System.out.println("O guerreiro " + guerreiro.nome + " de nível " + guerreiro.nivel + " tem uma força de  " + guerreiro.forca);
        System.out.println("A maga " + mago.nome + " de nível " + mago.nivel + " tem uma mana de " + mago.mana);
    }
}