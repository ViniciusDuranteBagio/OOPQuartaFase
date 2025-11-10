package org.example;

import AtividadesAula8.CarrinhoDeCompras;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarrinhoDeComprasTest {
    @Test
    public void testAdicionarItem() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("maçã");

        assertTrue(carrinho.getItens().contains("maçã"));
    }
}
