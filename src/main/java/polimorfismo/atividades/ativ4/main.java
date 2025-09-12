package polimorfismo.atividades.ativ4;

public class main {
    public static void main(String[] args) {

        IPagamento cartao = new Cartao();
        IPagamento boleto = new Boleto();
        IPagamento pix = new Pix();

        cartao.processarPagamento(1500);
        boleto.processarPagamento(7947.45);
        pix.processarPagamento(0.01);

    }
}
