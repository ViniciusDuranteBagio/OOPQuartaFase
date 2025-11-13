package Aula7;

public class MenorDeIdadeException extends RuntimeException {
  public MenorDeIdadeException() {
    super("Menor de idade não pode se cadastrar");
  }
}
