//Exercício 8: Criando uma Hierarquia de Contas Bancárias
//Crie uma classe ContaBancaria com os atributos titular e saldo.Depois, crie duas subclasses:
//ContaCorrente, que tem um atributo taxaManutencao.
//ContaPoupanca, que tem um atributo taxaJuros.
//No main(), crie uma ContaCorrente e uma ContaPoupanca, atribua valores e exiba os detalhes.

package org.example;

public class ContaPoupanca extends ContaBancaria {

    private double taxaDeJuros;

    public ContaPoupanca(String titular, int saldo, double taxaDeJuros) {
        super(titular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void exibirInformacoes() {
        System.out.println("-----------------------------------" + "\nTipo de Conta: Conta Poupanca " + "\nTitular: " + titular +
                "\nSaldo: " + saldo + "\nTaxa de Juros: " + taxaDeJuros + "\n-----------------------------------");
    }
}
