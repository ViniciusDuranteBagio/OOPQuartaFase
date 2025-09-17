package Atividades_Aula_5;

class Pix implements Pagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via Pix: " + chavePix);
    }
}
