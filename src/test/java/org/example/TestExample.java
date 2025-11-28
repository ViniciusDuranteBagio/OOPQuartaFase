package org.example;

import AgendaVeterinario.exception.ValidarNomeException;
import AgendaVeterinario.model.Animal;
import AgendaVeterinario.model.Cachorro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestExample {
  @Test
  void deveLancarExcecaoParaNomeInvalido() {
    assertThrows(ValidarNomeException.class, () -> {
      new Cachorro("123", 3, "Vira-lata");
    });
  }
}

