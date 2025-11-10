package org.example;

import Aula8.CarrinhoDeCompras;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoTeste {

    @Test

    public void carrinhoTeste() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItens("maçã");
        assertEquals("maçã", carrinho.listaItens());
    }
}
