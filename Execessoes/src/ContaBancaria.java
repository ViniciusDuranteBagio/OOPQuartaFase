
    class ContaBancaria {
        private double saldo;

        public void depositar(double valor) {
            if (valor < 0) {
                throw new IllegalArgumentException("Depósito não pode ser negativo!");
            }
            saldo += valor;
            System.out.println("Depósito realizado. Saldo: R$" + saldo);
        }

        public void sacar(double valor) {
            if (valor > saldo) {
                throw new IllegalArgumentException("Saldo insuficiente!");
            }
            saldo -= valor;
            System.out.println("Saque realizado. Saldo: R$" + saldo);
        }
}