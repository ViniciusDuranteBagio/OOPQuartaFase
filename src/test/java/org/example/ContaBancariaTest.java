package org.example;
import Aula7BrenoLibrelatoManoel.ContaBancaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {

    @Test
    public void testDepositarValorNegativoNaoAlteraSaldo() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(-50);
        assertEquals(0, conta.getSaldo(), "O saldo deve permanecer 0 ao depositar valor negativo");
    }

    @Test
    public void testDepositarValorPositivoAumentaSaldo() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100);
        assertEquals(100, conta.getSaldo(), "O saldo deve ser 100 após depósito válido");
    }
}