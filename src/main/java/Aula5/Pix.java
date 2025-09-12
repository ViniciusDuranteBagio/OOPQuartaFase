package Aula5;

public class Pix implements MetodoPagamento {
    @Override
    public void cobrar() {
        System.out.println("Gerando QRCode...");
    }
}
