package exercicios;

public class Lampada {
    private boolean acesa;

    public void ligar() {
        acesa = true;
        System.out.println("A lâmpada foi acesa!");
    }

    public void desligar() {
        acesa = false;
        System.out.println("A lâmpada foi apagada!");
    }
}
