public class Pix implements FormaPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Pix de R$" + valor + " realizado.");
    }
}
