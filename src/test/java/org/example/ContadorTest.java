package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContadorTest {

    @Test
    public void testIncrementarTresVezes() {
        Contador c = new Contador();
        c.incrementar();
        c.incrementar();
        c.incrementar();
        assertEquals(3, c.getValor());
    }
}
