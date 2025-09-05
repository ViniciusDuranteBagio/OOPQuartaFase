package Prova;

    public class ContaBancaria {
        private double saldo;
        private String titular;
        public double getSaldo() {
            return saldo;
        }
        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public void depositar(double valor) {
            if (valor < 0) {
                valor = 0;
            }
            saldo += valor;
        }

        public void sacar(double valor) {
            if (saldo > valor) {
                saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente");
            }
        }
    }



