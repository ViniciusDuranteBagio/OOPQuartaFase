public class ContaCorrente extends ContaBancariaH{
    private double taxaManutencao;

    public ContaCorrente(String titular, double saldo, double taxaManutencao){
        super(titular,saldo);
        this.taxaManutencao=taxaManutencao;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Taxa de manutenção: R$ "+taxaManutencao);
    }
}
