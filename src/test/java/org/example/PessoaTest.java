package org.example;

import Atividades_Aula_7.Pessoa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void testEhMaiorDeIdadeTrue() {
        Pessoa p = new Pessoa("Ana", 20);
        assertTrue(p.ehMaiorDeIdade());
    }

    @Test
    void testEhMaiorDeIdadeFalse() {
        Pessoa p = new Pessoa("Leo", 15);
        assertFalse(p.ehMaiorDeIdade());
    }

    @Test
    void testSetNome() {
        Pessoa p = new Pessoa("Maria", 22);
        p.setNome("Carlos");
        assertEquals("Carlos", p.getNome());
    }
}
