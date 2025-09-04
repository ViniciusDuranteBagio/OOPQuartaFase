package Prova;

public class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$" + valor + "Transferido com sucesso");
        }else {
            System.out.println("Valor inválido");

        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + "Transferido com sucesso");
        } else {
            System.out.println("Saque não permitido, Saldo insuficiente ou valor inválido");
        }
    }

    public void exibirSaldo(){
        System.out.println("Titular " + titular + "Saldo = " + saldo);

    }
}
