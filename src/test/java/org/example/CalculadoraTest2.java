package org.example;

import AtividadesAula8.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest2 {
    @Test
    public void testCalculadora() {
        Calculadora calc = new Calculadora();

        assertEquals(7, calc.somar(3, 4));
        assertEquals(5, calc.subtrair(10, 5));
        assertEquals(15, calc.multiplicar(3, 5));
        assertEquals(5, calc.dividir(10, 2));
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }
}
