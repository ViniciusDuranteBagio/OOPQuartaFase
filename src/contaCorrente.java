package org.example;

public class contaCorrente extends contaBancaria1{
    public int taxaManutençao;


    public int getTaxaManutençao() {
        taxaManutençao += ((saldo / 100) * taxaManutençao);
        return taxaManutençao;
    }
}
