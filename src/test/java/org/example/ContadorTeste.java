package org.example;

import Aula8.Contador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContadorTeste {
    @Test
    public void testeIncrementar() {
        Contador contador = new Contador();
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        assertEquals(3, contador.getValor());
    }
}
