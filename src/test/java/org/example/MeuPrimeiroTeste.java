package org.example;

import Aula8.Pessoa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MeuPrimeiroTeste {
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
    public void testeAnaMaior() {
        Pessoa pessoa3 = new Pessoa ("Ana", 20);
        assertEquals(true, pessoa3.isAdult());
    }
    @Test
    public void testeLeoMenor() {
        Pessoa pessoa4 = new Pessoa ("Leo", 15);
        assertEquals(false, pessoa4.isAdult());
    }
    @Test
    public void testeSetNome() {
        Pessoa pessoa5 = new Pessoa("Carlos", 25);
        pessoa5.setNome("Carlos");
        assertEquals("Carlos", pessoa5.getNome());
    }
}
