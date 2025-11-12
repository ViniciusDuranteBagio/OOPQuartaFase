package org.example;

import Atividades_Aula_7.CarrinhoDeCompras;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoDeComprasTest {

    @Test
    void testAdicionarItem() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("maçã");
        assertTrue(carrinho.getItens().contains("maçã"));
    }
}

