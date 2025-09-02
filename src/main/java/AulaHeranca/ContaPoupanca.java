package AulaHeranca;

public class ContaPoupanca extends ContaBancaria {
    int taxaJuros;

    public ContaPoupanca (String titular, double saldo, int taxaJuros) {
        super (titular, saldo);
        this.taxaJuros = taxaJuros;
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Taxa de juros: " + taxaJuros + "%");
    }
}

