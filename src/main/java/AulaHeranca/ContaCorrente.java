package AulaHeranca;

public class ContaCorrente extends ContaBancaria {

    int taxaManutencao;

    public ContaCorrente (String titular, double saldo, int taxaManutencao) {
        super (titular, saldo);
        this.taxaManutencao = taxaManutencao;
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Taxa de manutenção: " + taxaManutencao);
    }
}
