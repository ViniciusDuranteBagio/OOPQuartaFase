package Aula1.Atividade;

public class Lampada {
    private boolean acesa;

   public void ligar() {
        if(!acesa) {
            acesa = true;
            System.out.println("A lâmpada foi acessa!");
        }else {
            System.out.println("A lâmpada já está acessa!");


        }

    }

   public void desligar() {
        if (acesa) {
            acesa = false;
            System.out.println("A lâmpada foi apagada!");
        }else {
            System.out.println("A lâmpada já está apagada!");

        }

    }

}
