package org.example;

import Aula8.Pessoa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {
  @Test
  public void pessoaAdultaTemQueRetornarTrue() {
    Pessoa pessoaUm = new Pessoa("teste", 19);
    assertEquals(true, pessoaUm.isAdult());
  }

  @Test
  public void pessoaAdultaTemQueRetornarTrueIdade18() {
    Pessoa pessoaUm = new Pessoa("teste", 18);
    assertEquals(true, pessoaUm.isAdult());
  }

  @Test
  public void pessoaCriancaTemQueRetornarFalse() {
    Pessoa pessoaUm = new Pessoa("teste", 11);
    assertEquals(false, pessoaUm.isAdult());
  }
}
