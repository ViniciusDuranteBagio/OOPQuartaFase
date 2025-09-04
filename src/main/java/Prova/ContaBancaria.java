package Prova;

public class ContaBancaria {
    public String titular;
    public double saldo;

    public void Depositar(double valor) {
        if (valor > 0) {
            saldo = valor;
            System.out.println("Voce depositou " + valor + " reais!");
        } else {
            System.out.println("Erro: deposite um valor maior que 0 para continuar");
        }
    }

    public void ExibirSaldo() {
        System.out.println("Seu saldo é: " + saldo);

    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Voce sacou " + valor + " Reais");
            } else {
                System.out.println("Saldo insuficiente, trabalhe mais!");
            }
        } else {
            System.out.println("Valor de saque deve ser maior que zero");
        }
    }
}
