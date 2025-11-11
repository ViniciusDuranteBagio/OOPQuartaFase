package org.example;

import Aula7BrenoLibrelatoManoel.CarrinhoDeCompras;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoTest {

    @Test
    public void testAdicionarItemDeveConterMaca() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("maçã");
        assertTrue(carrinho.getItens().contains("maçã"), "O carrinho deve conter 'maçã'");
    }
}