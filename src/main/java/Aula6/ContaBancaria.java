package Aula6;
/*Simule transferência. Se o valor depositado for negativo, lance uma exceção e mostre a mensagem
 para o usuario, se a tentativa de saque for maior que o valor na conta, lance uma exceção e
 mostre a mensagem para o usuario. Classes a criar:
ContaBancaria
 */

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public static class ValorNegativoException extends Exception {
        public ValorNegativoException(String msg) {
            super(msg);
        }
    }

    public static class SaldoInsuficienteException extends Exception {
        public SaldoInsuficienteException(String msg) {
            super(msg);
        }
    }

    public void depositar(double valor) throws ValorNegativoException {
        if (valor < 0) {
            throw new ValorNegativoException("Depósito não pode ser negativo!");
        }
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
    }

    public double getSaldo() {
        return saldo;
    }
}
