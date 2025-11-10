package org.example;

import Aula8.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTeste {
    @Test
    public void testarAoQuadrado() {
        Calculadora calculadora = new Calculadora();
        assertEquals(9, calculadora.elevarAoQuadrado(3));
    }

    @Test
    public void testarSoma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(7, calculadora.somarNumero(3, 4));
    }

    @Test
    public void testarSubtracao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.subtrairNumero(10, 5));
    }

    @Test
    public void testarMultiplicacao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(15, calculadora.multiplicarNumero(3, 5));
    }

    @Test
    public void testarDivisao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.dividirNumero(10, 2));
    }

    @Test
    public void testarDivisaoPorZero() {
        Calculadora calculadora = new Calculadora();
        ArithmeticException excecao = assertThrows(ArithmeticException.class,
                () -> calculadora.dividirNumero(10, 0));
        assertEquals("Impossível dividir por zero", excecao.getMessage());
    }

}


