//Exercício 8: Criando uma Hierarquia de Contas Bancárias
//Crie uma classe ContaBancaria com os atributos titular e saldo.Depois, crie duas subclasses:
//ContaCorrente, que tem um atributo taxaManutencao.
//ContaPoupanca, que tem um atributo taxaJuros.
//No main(), crie uma ContaCorrente e uma ContaPoupanca, atribua valores e exiba os detalhes.

package org.example;

public class ContaCorrente extends ContaBancaria {

    private int taxaManutencao;

    public ContaCorrente(String titular, int saldo, int taxaManutencao) {
        super(titular, saldo);
        this.taxaManutencao = taxaManutencao;
    }

    public void exibirInformacoes() {
        System.out.println("-----------------------------------" + "\nTipo de Conta: Conta Corrente " + "\nTitular: " + titular +
                "\nSaldo: " + saldo + "\nTaxa de Manutenção: " + taxaManutencao + "\n-----------------------------------");
    }
}
