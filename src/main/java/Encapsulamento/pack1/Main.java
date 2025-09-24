package Encapsulamento.pack1;
public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("12345", "João Silva", 1000);

        conta.exibirSaldo();
        conta.depositar(500);
        conta.sacar(200);
        conta.exibirSaldo();

        // Tentando sacar mais do que o saldo
        conta.sacar(2000);

        // Alterando titular
        conta.setTitular("Maria Oliveira");
        System.out.println("Titular atualizado: " + conta.getTitular());
    }
}