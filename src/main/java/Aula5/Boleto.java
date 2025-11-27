public class Boleto implements FormaPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Boleto gerado no valor de R$" + valor);
    }
}
