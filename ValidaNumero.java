package Aula7;

public class ValidaNumero {
  public void validar (int valor1, int valor2) {
    if (valor1 == 0 || valor2 == 0) {
      throw new RuntimeException("valor não pode ser 0");
    }
  }
}
