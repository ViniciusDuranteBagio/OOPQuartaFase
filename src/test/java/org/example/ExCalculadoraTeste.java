package org.example;

import org.junit.jupiter.api.Test;
import Aula8.ExCalculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExCalculadoraTeste {

    @Test
    public void testarAoQuadrado3() {
        ExCalculadora calculadora = new ExCalculadora();
        double resultado = calculadora.elevarAoQuadrado(3);
        assertEquals(9, resultado);
    }

    @Test
    public void testarAoQuadrado2() {
        ExCalculadora calculadora = new ExCalculadora();
        double resultado = calculadora.elevarAoQuadrado(2);
        assertEquals(4, resultado);
    }

}
