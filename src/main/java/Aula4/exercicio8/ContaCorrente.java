package Aula4.exercicio8;
public class ContaCorrente extends ContaBancaria {
    public double taxaManutencao;

    public ContaCorrente(String titular, double saldo, double taxaManutencao) {
        super(titular, saldo);
        this.taxaManutencao = taxaManutencao;
    }
}