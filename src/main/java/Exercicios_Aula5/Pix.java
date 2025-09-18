package Exercicios_Aula5;

public class Pix implements IFormaPagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Escaneando código QR" +
                "\nInserindo valor do pagamento" +
                "\nConfirmando remetente da transferência" +
                "\nPagamento realizado via Pix");
        System.out.println(" ");
    }
}