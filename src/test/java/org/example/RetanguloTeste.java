package org.example;

import Aula8.Retangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetanguloTeste {

    @Test
    public void testeArea() {
        Retangulo retangulo = new Retangulo(4,5);
        assertEquals(20, retangulo.calcularArea());
    }
    @Test
    public void testePerimetro() {
        Retangulo retangulo1 = new Retangulo(4,5);
        assertEquals(18, retangulo1.calcularPerimetro());
    }
    @Test
    public void testeConstrutor() {
        Retangulo retangulo2 = new Retangulo(3, 6);
        assertEquals(3, retangulo2.getLargura());
        assertEquals(6, retangulo2.getAltura());
    }
}
