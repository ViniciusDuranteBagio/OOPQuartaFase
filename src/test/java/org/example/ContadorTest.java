package org.example;

import AtividadesAula8.Contador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContadorTest {
    @Test
    public void testContador(){
        Contador contador = new Contador();
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        assertEquals(3, contador.getValor());
    }
}
