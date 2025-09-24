package org.AtividadesPOO;
//Atividade01 EncapsulamentoAula03
    public class ContaBancaria {

        private String numeroConta;
        private double saldo;
        private String titular;

        public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
            this.numeroConta = numeroConta;
            this.titular = titular;
            if (saldoInicial >= 0) {
                this.saldo = saldoInicial;
            } else {
                this.saldo = 0;
            }
        }

        public String getNumeroConta() {
            return numeroConta;
        }

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
            } else {
                System.out.println("Valor de depósito inválido!");
            }
        }

        public void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso!");
            } else {
                System.out.println("Saque não realizado. Saldo insuficiente ou valor inválido!");
            }
        }

        public void exibirSaldo() {
            System.out.println("Saldo atual da conta (" + numeroConta + "): R$" + saldo);
        }
    }