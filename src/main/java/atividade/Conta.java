
public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws Aula6.SaldoInsuficienteException {
        if (valor > saldo) {
            throw new Aula6.SaldoInsuficienteException("Saldo insuficiente para saque");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Conta conta = new Conta(1000);
        try {
            conta.sacar(500);
            System.out.println("Saque realizado. Saldo atual: " + conta.getSaldo());
            conta.sacar(600);
        } catch (Aula6.SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
