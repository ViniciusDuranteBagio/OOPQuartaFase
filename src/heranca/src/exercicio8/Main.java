package exercicio8;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente("Jefferson", 10000, 400);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Paulo", 25000, 1200);

        System.out.println("O " + contaCorrente.titular + " tem um saldo de " + contaCorrente.saldo +
                " em sua conta corrente e uma taxa de manutenção de " + contaCorrente.taxaManutencao);

        System.out.println("O " + contaPoupanca.titular + " tem um saldo de " + contaPoupanca.saldo +
                " em sua conta poupança e uma taxa de juros de " + contaPoupanca.taxaJuros);
    }
}
