package Aula6;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor de depósito não pode ser negativo");
        }
        saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);
        try {
            conta.depositar(500);
            System.out.println("Depósito realizado. Saldo atual: " + conta.getSaldo());
            conta.sacar(2000);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
