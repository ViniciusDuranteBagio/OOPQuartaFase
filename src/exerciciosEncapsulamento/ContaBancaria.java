public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;

    public int getNumeroConta() {
        return numeroConta;
    }
    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
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
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public void exibirSaldo() {
        System.out.println("Seu saldo atual é: R$ " + saldo);
    }
}
