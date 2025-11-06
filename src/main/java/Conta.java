
    class SaldoInsuficienteException extends Exception {
        public SaldoInsuficienteException(String mensagem) {
            super(mensagem);
        }
    }
    class Conta {
        private double saldo;
        public Conta(double saldoatual) {
            this.saldo = saldoatual;
        }
        public void saque(double valor) throws SaldoInsuficienteException {
            if (valor > this.saldo) {
                throw new SaldoInsuficienteException("Não é possivel fazer o saque.");
            }
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " feito. Saldo atual R$" + this.saldo);
        }
    }


