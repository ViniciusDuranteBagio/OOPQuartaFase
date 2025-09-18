package Aula4;

public class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;
    
    // Construtor
    public ContaCorrente(String titular, double saldo, double taxaManutencao) {
        super(titular, saldo);
        this.taxaManutencao = taxaManutencao;
    }
    
    // Getter e Setter
    public double getTaxaManutencao() {
        return taxaManutencao;
    }
    
    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }
    
    // Sobrescrevendo o método da superclasse
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Taxa de Manutenção: R$ " + this.taxaManutencao);
    }
} 