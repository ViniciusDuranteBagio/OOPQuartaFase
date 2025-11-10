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
        public void subtrair() {
            Calculadora calcular1 = new Calculadora();
            assertEquals(5, calcular1.subtrair(10,5));

    }

    @Test
        public void multiplicar() {
            Calculadora calculadora = new Calculadora();
            assertEquals(15, calculadora.multiplicar(3, 5));
    }

    @Test
        public void dividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.dividir(10, 2));
    }
    @Test
    public void dividirZero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }
}