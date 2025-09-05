package Prova;

public class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valorDeposito){
        if (valorDeposito >0){
            saldo += valorDeposito;
            System.out.println("Seu depósito de " + valorDeposito + " foi concluído com sucesso!");
        } else {
            System.out.println("Este valor não é válido.");
        }


    }
    public void sacar(double valorSaque){
        if (valorSaque >0 && saldo > valorSaque){
            saldo -= valorSaque;
            System.out.println("Seu saque de " + valorSaque + " foi efetuado com sucesso!");
        }else {
            System.out.println("Não é possível efetuar um saque com este valor. Saldo insuficiente.");
        }


    }
}
