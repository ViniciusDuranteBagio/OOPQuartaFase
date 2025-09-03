package Prova;

public class Main_ContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.saldo=100;
        conta.titular="Davi";
        conta.depositar(50);
        conta.sacar(20);
    }
}
