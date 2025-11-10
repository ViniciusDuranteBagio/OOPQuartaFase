package org.example;

import AtividadesAula8.Retangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {
    @Test
    public void testRetangulo() {
        Retangulo retangulo = new Retangulo(4, 5);
        assertEquals(20,retangulo.calcularArea());

        Retangulo retangulo2 = new Retangulo(3, 6);
        assertEquals(3, retangulo2.getAltura());
        assertEquals(6, retangulo2.getLargura());
    }
}
