package org.example;
/*
 Exercício 8: Criando uma Hierarquia de Contas Bancárias

    Crie uma classe ContaBancaria com os atributos titular e saldo.Depois, crie duas subclasses:

    ContaCorrente, que tem um atributo taxaManutencao.

    ContaPoupanca, que tem um atributo taxaJuros.

    No main(), crie uma ContaCorrente e uma ContaPoupanca, atribua valores e exiba os detalhes.

 */
public class contaBancaria1 {
    public String titular;
    public double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
