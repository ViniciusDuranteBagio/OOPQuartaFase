package ExerciciosAula5;

public class Pix implements FormaDePagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Gerando QR Code PIX de R$" + valor + "... Pagamento concluído!");
    }
}