package aula1;

public class Lampada {
    private boolean acesa = false;

    public void ligar() {
        if (!acesa) {
            this.acesa = true;
            System.out.println("A lâmpada foi acesa!");
        } else {
            System.out.println("A lâmpada já está acesa!");
        }
    }

    public void desligar() {
        if (acesa) {
            this.acesa = false;
            System.out.println("A lâmpada foi apagada!");
        } else {
            System.out.println("A lâmpada já está apagada!");
        }
    }
}
