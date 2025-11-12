package exercicios_aula_6.exercicios_11;

class ContaBancaria {
private double saldo;

public ContaBancaria(double saldoInicial) {
    this.saldo = saldoInicial;
}

public double getSaldo() {
    return saldo;
}

public void depositar(double valor) {
    if (valor < 0) {
        throw new IllegalArgumentException("Não é possível depositar valor negativo");
    }
    saldo += valor;
}

public void sacar(double valor) {
    if (valor > saldo) {
        throw new ArithmeticException("Saldo insuficiente para saque");
    }
    saldo -= valor;
}

public void transferir(ContaBancaria destino, double valor) {
    this.sacar(valor);
    destino.depositar(valor);
}
}
