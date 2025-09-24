package Polimorfismo;

public class Boleto implements Pagamento {
    private long numeroBoleto;

    public Boleto(long numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Boleto: " + numeroBoleto + " pago");

    }
}
