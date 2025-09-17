package Atividades_Aula_5;

class Boleto implements Pagamento {
    private String codigoBoleto;

    public Boleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via Boleto: " + codigoBoleto);
    }
}