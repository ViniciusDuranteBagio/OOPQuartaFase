package org.example;

import org.junit.jupiter.api.Test;
import Aula8.ExPessoa;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExPessoaTeste {

    @Test
    public void pessoaAdultaTemQueRetornarTrue() {
        ExPessoa pessoaUm = new ExPessoa("teste", 19);
        assertEquals(true, pessoaUm.isAdult());
    }

    @Test
    public void pessoaAdultaTemQueRetornarTrueIdade18() {
        ExPessoa pessoaUm = new ExPessoa("teste", 18);
        assertEquals(true, pessoaUm.isAdult());
    }

    @Test
    public void pessoaCriancaTemQueRetornarFalse() {
        ExPessoa pessoaUm = new ExPessoa("teste", 11);
        assertEquals(false, pessoaUm.isAdult());
    }
}
