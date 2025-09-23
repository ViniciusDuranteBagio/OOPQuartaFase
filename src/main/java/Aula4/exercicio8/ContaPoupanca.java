package Aula4.exercicio8;

public class ContaPoupanca extends ContaBancaria {
    public double taxaJuros;

    public ContaPoupanca(String titular, double saldo, double taxaJuros) {
        super(titular, saldo);
        this.taxaJuros = taxaJuros;
    }
}