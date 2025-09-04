package Prova;

public class ContaBancaria {

        String titular;
        double saldo;

        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        }

        public void sacar(double valor) {
            if (valor > 0) {
                if (saldo >= valor) {
                    saldo -= valor;
                    System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
                } else {
                    System.out.println("Saldo insuficiente para saque de R$ " + valor);
                }
            } else {
                System.out.println("Valor de saque inválido.");
            }
        }

        public void mostrarSaldo() {
            System.out.println("Saldo atual: R$ " + saldo);
        }
    }




