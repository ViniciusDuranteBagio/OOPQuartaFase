package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CarrinhoDeComprasTest {

    @Test
    public void testAdicionarItem() {
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.adicionarItem("maçã");
        assertTrue(c.getItens().contains("maçã"));
    }
}
