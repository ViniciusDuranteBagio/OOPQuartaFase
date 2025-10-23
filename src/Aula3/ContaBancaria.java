package Aula3;

public class ContaBancaria {

        private String numeroConta;
        private double saldo;
        private String titular;

        public ContaBancaria(String numeroConta, String titular) {
            this.numeroConta = numeroConta;
            this.titular = titular;
            this.saldo = 0.0;
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
                System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor inválido para depósito.");
            }
        }

        public void sacar(double valor) {
            if (valor > 0 && saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente ou valor inválido para saque.");
            }
        }

        public void exibirSaldo() {
            System.out.println("Saldo atual: R$" + saldo);
        }
    }


