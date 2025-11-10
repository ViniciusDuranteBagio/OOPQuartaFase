package org.example;

import AtividadesAula8.ContaBancaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaBancariaTest {
    @Test
    public void testContaBancaria(){
        ContaBancaria conta = new ContaBancaria(1000);
        double saldoAnterior = conta.getSaldo();
        assertEquals(saldoAnterior, conta.depositar(-50));
    }
}
