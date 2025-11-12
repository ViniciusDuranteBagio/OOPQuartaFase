package org.example;

import Aula8.ContaBancaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteContaBancaria {

    @Test
    public void testeDeposito() {
        ContaBancaria deposito = new ContaBancaria(500);
        assertEquals(500, deposito.depositar(-50));
    }

}
