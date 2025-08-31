package Aula04;

public class ContaCorrente extends ContaBancaria {
    protected double taxaManutencao;

    public ContaCorrente(String titular, double saldo, double taxaManutencao) {
        super(titular, saldo);
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de Manutencao: " + this.taxaManutencao + "%");
    }
}
