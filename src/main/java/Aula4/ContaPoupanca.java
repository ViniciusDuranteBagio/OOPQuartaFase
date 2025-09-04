package Aula4;

public class ContaPoupanca extends ContaBancaria{
    double taxaJuros;

    public ContaPoupanca(String titular, double saldo, double taxaJuros) {
        super(titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void exibeDetalhes() {
        super.exibeDetalhes();
        System.out.println("Taxa de Juros: " + taxaJuros);
    }
}
