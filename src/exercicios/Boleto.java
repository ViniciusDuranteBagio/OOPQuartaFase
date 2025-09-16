package exercicios;

class Boleto implements FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " via Boleto");
    }
}
