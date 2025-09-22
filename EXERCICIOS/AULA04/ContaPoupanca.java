public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(String titular, double saldo, double taxaJuros) {
        super(titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }
}
