package org.example;

import Aula8.Pessoa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTeste {
    @Test
    public void testeAdulto(){
        Pessoa pessoa1  = new Pessoa("Marcelo", 19);
        assertEquals(true, pessoa1.isAdult()) ;
    }
@Test
    public void testeCrianca() {
        Pessoa pessoa2 = new Pessoa("Renato", 15);
        assertEquals(true, pessoa2.isAdult());
    }

    @Test
    public void testeAna() {
        Pessoa ana = new Pessoa("Ana", 20);
        assertEquals(true, ana.isAdult());
    }

    @Test
    public void testeLeo() {
        Pessoa leo = new Pessoa("Leo", 15);
        assertEquals(false, leo.isAdult());
    }
}
