package org.example;

import Aula8.CarrinhoDeCompras;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoDeComprasTeste {

    @Test
    public void testAdicionarItem() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("maçã");
        assertTrue(carrinho.getItens().contains("maçã"));
    }
}