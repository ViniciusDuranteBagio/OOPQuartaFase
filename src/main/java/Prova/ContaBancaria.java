package Prova;

public class ContaBancaria {
    String titular = "Kaio";
    double saldo = 2000;

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("É isso ai deposito concluindo");
        } else {
            System.out.println("Como você quer fazer um deposito negativo");
        }
    }
    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Parabéns você tem dinheiro por isso o saque foi concluido");
        } else {
            System.out.println("Rapaz ou você é pobre e não tem dinheiro ou errou o valor " +
                    "da uma olhada ai");
        }
    }
    void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$" + saldo);
    }
}

