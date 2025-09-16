package Exercicios_Aula1;

public class Lampada {

    boolean interruptor;

    public void ligar() {
        if (interruptor == true) {
            System.out.println("A lâmpada já está ligada!");
        } else {
            interruptor = true;
            System.out.println("A lâmpada foi ligada!");
        }
    }

    public void desligar() {
        if (interruptor == false) {
            System.out.println("A lâmpada já está desligada!");
        } else {
            interruptor = false;
            System.out.println("A lâmpada foi desligada!");
        }
    }
}
