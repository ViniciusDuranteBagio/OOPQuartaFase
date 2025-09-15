package Aula4;

public class ContaCorrente extends ContaBancaria{
    //Atributos da classe
    private double taxaManutencao;

    //construtor da classe
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
        this.taxaManutencao = 0.2;
    }

    //metodos getter da classe
    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    @Override
    public void exibirSaldo() {
        super.exibirSaldo();
        System.out.println("Taxa Manutenção: " + getTaxaManutencao());
    }
}
