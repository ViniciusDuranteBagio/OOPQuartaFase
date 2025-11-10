package org.example;

import AtividadesAula8.Pessoa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest2 {
    @Test
    public void testPessoa() {
        Pessoa pessoa1 = new Pessoa("Ana", 20);
        assertTrue(pessoa1.ehMaiorDeIdade());

        Pessoa pessoa2 = new Pessoa("Leo", 15);
        assertFalse(pessoa2.ehMaiorDeIdade());

        pessoa2.setNome("Carlos");
        assertEquals("Carlos", pessoa2.getNome());
    }
}
