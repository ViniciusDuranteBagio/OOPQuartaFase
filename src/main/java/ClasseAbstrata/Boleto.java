package ClasseAbstrata;

public class Boleto extends Pagamento {
    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Gerando boleto no valor de R$" + valor);
    }
}
