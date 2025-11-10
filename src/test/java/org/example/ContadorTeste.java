package org.example;

import Aula8.Contador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContadorTeste {

    @Test

    public void contador() {
        Contador contador = new Contador(0);
        assertEquals(3, contador.incrementar(3));
    }
}
