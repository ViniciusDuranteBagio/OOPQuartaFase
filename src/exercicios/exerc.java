public class FormasPagamento {
    public static void main(String[] args) {
        FormaPagamento cartao = new Cartao();
        FormaPagamento boleto = new Boleto();
        FormaPagamento pix = new Pix();
        
        cartao.processarPagamento(150.50);
        boleto.processarPagamento(200.75);
        pix.processarPagamento(99.90);
    }
}

