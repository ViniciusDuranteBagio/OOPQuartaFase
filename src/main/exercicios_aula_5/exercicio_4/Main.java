package exercicio_4;

public class Main {
    public static void main(String[] args) {
        IFormaPagamento f1 = new Cartao();
        IFormaPagamento f2 = new Boleto();
        IFormaPagamento f3 = new Pix();

        IFormaPagamento[] pagamentos = { f1, f2, f3 };

        for (IFormaPagamento f : pagamentos) {
            f.processarPagamento(150.0);
        }
    }
}
