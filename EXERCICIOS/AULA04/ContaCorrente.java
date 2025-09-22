public class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;

    public ContaCorrente(String titular, double saldo, double taxaManutencao) {
        super(titular, saldo);
        this.taxaManutencao = taxaManutencao;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }
}
