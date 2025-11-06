package org.example;
import Aula8.TesteMultiDivi;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testMultiDivi {

    @Test
    public void multiplicar() {
        TesteMultiDivi test1 = new TesteMultiDivi();
        int resultado = test1.multiplicacao(3, 5);
        assertEquals(15, resultado);
    }

    @Test
    public void divisao() {
        TesteMultiDivi test2 = new TesteMultiDivi();
        int resultado = test2.divisao(10, 2);
        assertEquals(2, resultado);

    }
}