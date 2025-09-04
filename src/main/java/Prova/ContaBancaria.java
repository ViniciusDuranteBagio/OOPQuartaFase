package Prova;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }
            public double getSaldo() {
                return saldo;
            }

            public String getTitular () {
                return titular;
            }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$" + valor + " realizado com sucesso. Saldo atual: " + saldo);
            } else {
                System.out.println("Valor inválido para depósito!");
            }
        }

        public void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: " + saldo);
            } else {
                System.out.println("Saque não permitido. Saldo insuficiente ou valor inválido.");
            }
        }
    }
