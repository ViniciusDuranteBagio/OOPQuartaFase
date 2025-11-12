package org.example;

import Aula8.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    @Test
    public void testSoma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(7,calculadora.somar(3,4));
    }
    @Test
    public void testSubtrair() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5,calculadora.subtrair(10,5));
    }
    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(15,calculadora.multiplicar(3,5));
    }
    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5,calculadora.dividir(10,2));
    }
}
