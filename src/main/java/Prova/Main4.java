package Prova;

public class Main4 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Davi";
        conta1.saldo = 1000.0;

        System.out.println("Titular: " + conta1.titular);
        System.out.println("Saldo inicial: R$" + conta1.saldo);

        conta1.depositar(500.0);
        conta1.sacar(300.0);
        conta1.sacar(1500.0); // aqui vai dar erradp

        System.out.println("Saldo final: R$" + conta1.saldo);
    }
}
