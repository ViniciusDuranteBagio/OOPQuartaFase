package ClasseAbstrata;

public class Cartao extends Pagamento {
    public Cartao(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento com cartão no valor de R$" + valor);
    }
}

