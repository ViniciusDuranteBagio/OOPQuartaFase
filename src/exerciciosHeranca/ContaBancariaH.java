public class ContaBancariaH {
    protected String titular;
    protected double saldo;

    public ContaBancariaH(String titular, double saldo){
        this.titular=titular;
        this.saldo=saldo;
    }
    public void exibirDetalhes(){
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: R$ "+saldo);
    }
}
