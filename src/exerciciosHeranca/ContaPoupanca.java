public class ContaPoupanca extends ContaBancariaH{
    private double taxaJuros;

    public ContaPoupanca(String titular, double saldo, double taxaJuros){
        super(titular, saldo);
        this.taxaJuros=taxaJuros;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Taxa de juros: "+taxaJuros+"%");
    }
}
