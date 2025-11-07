package org.example;

import Aula8.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
  @Test
  public void testElevadoAoQuadrado6() {
    Calculadora calculadora = new Calculadora();
    int resultado = calculadora.elevarAoQuadrado(6);
    assertEquals(36, resultado);
  }

  @Test
  public void testElevadoAoQuadrado9() {
    Calculadora calculadora = new Calculadora();
    int resultado = calculadora.elevarAoQuadrado(9);
    assertEquals(81, resultado);
  }

  @Test
  public void testeSubtrair() {
    Calculadora calculadora = new Calculadora();
    int resultado = calculadora.subtrair(6, 9);
    assertEquals(-3, resultado);
  }
}
