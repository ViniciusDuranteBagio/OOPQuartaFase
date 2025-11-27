package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RetanguloTest {

    @Test
    public void testCalcularArea() {
        Retangulo r = new Retangulo(4, 5);
        assertEquals(20, r.calcularArea());
    }

    @Test
    public void testConstrutor() {
        Retangulo r = new Retangulo(3, 6);
        assertEquals(3, r.getLargura());
        assertEquals(6, r.getAltura());
    }
}