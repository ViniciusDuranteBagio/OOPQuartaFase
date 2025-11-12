package org.example;

import Atividades_Aula_7.ContaBancaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {

    @Test
    void testDepositoNegativoNaoAlteraSaldo() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(-50);
        assertEquals(0, conta.getSaldo());
    }
}
