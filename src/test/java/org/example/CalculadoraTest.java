package org.example;

import Aula8.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
  @Test
  public void testarAoQuadrado3() {
    Calculadora calculadora = new Calculadora();
    double resultado = calculadora.elevarAoQuadrado(3);
    assertEquals(9, resultado);
  }

  @Test
  public void testarAoQuadrado2() {
    Calculadora calculadora = new Calculadora();
    double resultado = calculadora.elevarAoQuadrado(2);
    assertEquals(4, resultado);
  }
}
