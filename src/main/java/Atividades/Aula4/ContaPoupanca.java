package Atividades.Aula4;

public class ContaPoupanca extends ContaBancaria{
    protected double taxaJuros;
    ContaPoupanca(String titular, double salario, double taxaJuros) {
        super(titular, salario);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Taxa de Juro: " + taxaJuros);
    }
}
