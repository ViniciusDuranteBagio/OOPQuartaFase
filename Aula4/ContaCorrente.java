package Aula4;

public class ContaCorrente extends ContaBancaria{
    private double taxaManutencao;

    public ContaCorrente(){
        super();
    }
    public ContaCorrente(String titular, double saldo, double taxaManutencao){
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
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Tipo: Conta Corrente \nTaxa de Manutenção: R$" + this.taxaManutencao);
    }
}
