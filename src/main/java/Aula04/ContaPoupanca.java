package Aula04;

public class ContaPoupanca extends ContaBancaria {
    protected double taxaJuros;

    public ContaPoupanca(String titular, double saldo, double taxaJuros) {
        super(titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de Juros: " + this.taxaJuros + "%");
    }
}
