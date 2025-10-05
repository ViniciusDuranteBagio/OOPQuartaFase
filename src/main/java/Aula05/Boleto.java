package Aula05;

public class Boleto implements Pagamento {
    private String codigoDeBarras;

    public Boleto(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " processado com Boleto!");
        System.out.println("Codigo de barras: " + codigoDeBarras);
    }
}
