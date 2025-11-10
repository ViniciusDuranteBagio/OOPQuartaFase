package org.example;

import Aula8.Retangulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTeste {

    @Test
    public void testeArea() {
        Retangulo retangulo1 = new Retangulo(4, 5);
        assertEquals(20, retangulo1.calcularArea());
        Retangulo retangulo2 = new Retangulo(3, 6);
        assertEquals(18, retangulo2.calcularArea());
    }
}
