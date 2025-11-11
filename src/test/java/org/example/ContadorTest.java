package org.example;

import Aula7BrenoLibrelatoManoel.Contador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContadorTest {

    @Test
    public void testIncrementarTresVezesDeveSerTres() {
        Contador contador = new Contador();
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        assertEquals(3, contador.getValor(), "Após três incrementos, o valor deve ser 3");
    }
}
