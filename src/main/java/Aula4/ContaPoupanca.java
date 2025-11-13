package Aula4;

public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;
    
    public ContaPoupanca(String titular, double saldo, double taxaJuros) {
        super(titular, saldo);
        this.taxaJuros = taxaJuros;
    }
    
    public double getTaxaJuros() {
        return taxaJuros;
    }
    
    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Taxa de Juros: " + this.taxaJuros + "%");
    }
} 