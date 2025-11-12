package Aula7;

public class Calculadora {

  public double dividir(int valor1, int valor2) {
    try {
      ValidaNumero validador = new ValidaNumero();
      validador.validar(valor1, valor2);
      return valor1 / valor2;
    } catch (Exception erro) {
      System.out.println("numero não pode ser 0");
      return 0;
    }
  }
}
