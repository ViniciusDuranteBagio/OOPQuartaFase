public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public static class DepositoInvalidoException extends Exception {
        public DepositoInvalidoException(String mensagem) {
            super(mensagem);
        }
    }

    public static class SaldoInsuficienteException extends Exception {
        public SaldoInsuficienteException(String mensagem) {
            super(mensagem);
        }
    }

    public void depositar(double valor) throws DepositoInvalidoException {
        if (valor <= 0) {
            throw new DepositoInvalidoException("Valor de depósito inválido: " + valor);
        }
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar11(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Saldo atual: R$" + saldo);
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual de " + titular + ": R$" + saldo);
    }
}