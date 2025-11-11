package org.example;
import static org.junit.jupiter.api.Assertions.*;
import Aula7BrenoLibrelatoManoel.Pessoa;
import org.junit.jupiter.api.Test;

public class PessoaTestBreno {

    @Test
    public void ehMaiorDeIdade() {
        Pessoa pessoa = new Pessoa();
        boolean resultado = pessoa.ehMaiorDeIdade("Ana", 20);
        assertEquals(true, resultado);
        boolean resultado2 = pessoa.ehMaiorDeIdade("Leo", 15);
        assertEquals(false, resultado2);
        String nome1 = pessoa.setNome("Carlos");
        assertEquals("Carlos", nome1);
    }
}
