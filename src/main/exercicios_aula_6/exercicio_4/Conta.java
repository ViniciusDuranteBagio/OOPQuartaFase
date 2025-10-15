package exercicio_4;

class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque");
        } else if (valor <= 0) {
            throw new SaldoInsuficienteException("Insira um valor válido para o saque");
        }
        saldo -= valor;
    }
}