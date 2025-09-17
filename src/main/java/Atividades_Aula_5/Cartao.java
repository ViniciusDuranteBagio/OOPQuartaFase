package Atividades_Aula_5;

class Cartao implements Pagamento {
    private String numeroCartao;

    public Cartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via Cartão: " + numeroCartao);
    }
}
