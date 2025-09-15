package Aula4;

public class ContaPoupanca extends ContaBancaria{

    //atributos da classe
    private double taxaJuros;

    //construtor da classe
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
        this.taxaJuros = 0.2;
    }

    //metodos getter
    public double getTaxaJuros() {
        return taxaJuros;
    }

    @Override
    public void exibirSaldo() {
        super.exibirSaldo();
        System.out.println("Taxa Juros: " + getTaxaJuros());
    }
}
