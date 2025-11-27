public class Cartao implements FormaPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Pagamento no cartão: R$" + valor);
    }
}
