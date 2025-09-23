package Aula4.exercicio3;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Lamborghini", "Urus", 4);
        Moto moto = new Moto("Triumph", "Tiger", 900);


        System.out.println("O carro " + carro.marca + " " + carro.modelo + " possui " + carro.quantidadeDePortas + " portas");
        System.out.println("A moto " + moto.marca + " " + moto.modelo + " possui " + moto.cilindrada + " cilindradas");

    }
}