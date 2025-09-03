public class ContaBancaria {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Erro: o titular não pode ser vazio.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: o valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirDados() {
        System.out.println("Titular: " + this.titular + " | Saldo: R$ " + this.saldo);
    }
}
