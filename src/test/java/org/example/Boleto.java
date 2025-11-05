package org.example;

public class Boleto implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via Boleto Bancário.");
    }
}

