package Aula4.Atividade;

public class ContaCorrente extends ContaBancaria{
    private double taxaManutencao;

    public ContaCorrente(String titular, double saldo, double taxaManutencao) {
        super(titular, saldo);
        this.taxaManutencao = taxaManutencao;
    }


    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }


    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Taxa de Manutenção: R$ " + this.taxaManutencao);
    }
}
