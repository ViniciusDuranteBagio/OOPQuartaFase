package org.example;
import Aula8.TesteSoma;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testSoma {

    @Test
    public void testarSoma() {
        TesteSoma test = new TesteSoma();
        int resultado = test.calculadoura(4,3);
        assertEquals(7,resultado);
    }
}
