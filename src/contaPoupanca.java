package org.example;

public class contaPoupanca extends contaBancaria1{
    public int taxaJuros;
    public int getTaxaJuros() {
        taxaJuros += ((saldo / 100) * taxaJuros);
        return taxaJuros;
    }
}
