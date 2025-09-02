//Exercício 8: Criando uma Hierarquia de Contas Bancárias
//Crie uma classe ContaBancaria com os atributos titular e saldo.Depois, crie duas subclasses:
//ContaCorrente, que tem um atributo taxaManutencao.
//ContaPoupanca, que tem um atributo taxaJuros.
//No main(), crie uma ContaCorrente e uma ContaPoupanca, atribua valores e exiba os detalhes.

package org.example;

public class ContaBancaria {

    protected String titular;
    protected int saldo;

    public ContaBancaria(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
}
