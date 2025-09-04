package Aula4;

public class ContaCorrente extends ContaBancaria{
    double taxaManutencao;

    public ContaCorrente(String titular, double saldo, double taxaManutencao) {
        super(titular, saldo);
        this.taxaManutencao = taxaManutencao;
    }

    public void exibeDetalhes() {
        super.exibeDetalhes();
        System.out.println("Taxa de Manutenção: " + taxaManutencao);
    }
}
