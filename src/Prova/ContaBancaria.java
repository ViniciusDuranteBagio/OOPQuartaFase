package OOPQuartaFase.src.Prova;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public void depositar(double valor) {

        if (saldo > 0) {
            saldo += valor;

        } else {

            System.out.println("Valor inválido para depósito");
        }

    }

    public void sacar(double valor) {

        if (saldo > 0 && saldo >= valor) {

            saldo -= valor;
        } else {

            System.out.println("Saque não permitido pois o valor de saque é insuficiente ou inválido! ");
        }


    }

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.titular = "Andrei";
        contaBancaria.saldo = 10000;

        contaBancaria.depositar(20000);
        contaBancaria.sacar(15000);
        contaBancaria.sacar(5000);

        System.out.println("Titular: " + contaBancaria.titular);
        System.out.println("Saldo Final R$" + contaBancaria.saldo);
    }
}
