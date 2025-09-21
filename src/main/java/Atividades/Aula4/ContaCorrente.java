package Atividades.Aula4;

public class ContaCorrente extends  ContaBancaria{

    protected double taxaManutencao;

    ContaCorrente(String titular, double salario, double taxaManutencao) {
        super(titular, salario);
        this.taxaManutencao =  taxaManutencao;
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Taxa de Manutenção: " + taxaManutencao);
    }
}
