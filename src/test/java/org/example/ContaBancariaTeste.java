package org.example;

import Aula8.ContaBancaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaBancariaTeste {

    @Test
    public void testeDeposito() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100);
        assertEquals(100, conta.getSaldo());

        }

    @Test
    public void testeDepositoNegativo() {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.depositar(-50);
        assertEquals(0, conta1.getSaldo());
    }
}
