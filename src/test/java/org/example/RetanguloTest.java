package org.example;

import Atividades_Aula_7.Retangulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {

    @Test
    void testCalcularArea() {
        Retangulo r = new Retangulo(4, 5);
        assertEquals(20, r.calcularArea());
    }

    @Test
    void testConstrutorMantemValores() {
        Retangulo r = new Retangulo(3, 6);
        assertEquals(3, r.getLargura());
        assertEquals(6, r.getAltura());
    }
}
