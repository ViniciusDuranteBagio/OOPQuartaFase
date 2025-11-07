package org.example;

import Aula8.Pessoa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {
  @Test
  public void testIsAdult() {
    Pessoa pessoa1 = new Pessoa("João", 20);
    assertTrue(pessoa1.isAdult());
  }

  @Test
  public void testIsAdult18Anos() {
    Pessoa pessoa1 = new Pessoa("Mateus", 18);
    assertTrue(pessoa1.isAdult());
  }

  @Test
  public void testIsAdultFalse() {
    Pessoa pessoa1 = new Pessoa("Maria", 12);
    assertFalse(pessoa1.isAdult());
  }
  @Test
  public void testeCriaIdadeNegativa() {
    Pessoa pessoa1 = new Pessoa("Maria", -1);
    assertEquals(0, pessoa1.getIdade());
    assertEquals("Maria", pessoa1.getNome());
  }
}
