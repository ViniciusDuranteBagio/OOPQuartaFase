package Prova;

class ContaBancaria {
    String titular;
    double saldo = 0;

    void depositar(double valor) {
        saldo += valor;
    }
    void sacar(double valor) {
        if(valor <= saldo) {
            saldo -=valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }
    void exibirSaldo() {
        System.out.println("Titular: " + titular + ", Saldo: " + saldo);
    }
}