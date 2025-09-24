package org.AtividadesPOO3;
//Atividade04 PolimorfismoAula05
    public interface Pagamento {
        void processarPagamento(double valor);
    }
    class Cartao implements Pagamento {
    private String numeroCartao;

    public Cartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " no cartão " + numeroCartao);
    }
}
    class Boleto implements Pagamento {
    private String codigoBoleto;

    public Boleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via boleto " + codigoBoleto);
    }
}
    class Pix implements Pagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via Pix chave: " + chavePix);
    }
}