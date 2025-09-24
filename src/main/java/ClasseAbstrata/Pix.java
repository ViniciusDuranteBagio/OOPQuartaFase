package ClasseAbstrata;

public class Pix extends Pagamento {
    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Pix no valor de R$" + valor);
    }
}
