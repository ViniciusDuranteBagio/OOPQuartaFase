package AtividadesAula06;

public class Conta {
    private double saldo;

    public Conta (double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar (double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para fazer saque.");
        }
        saldo -= valor;
        System.out.println("Saque realizado com sucesso: " + valor);
        }
        public double getSaldo () {
        return saldo;
    }
}