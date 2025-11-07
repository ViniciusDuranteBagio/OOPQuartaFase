package aula05;

public interface Pagamento {
    void processarPagamento(double valor);
}


class Cartao implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via Cartão.");
    }
}


class Boleto implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " gerado via Boleto.");
    }
}


class Pix implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " enviado via Pix.");
    }
}

