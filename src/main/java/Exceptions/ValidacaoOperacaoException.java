package Exceptions;

/**
 * Exceção customizada para validações e operações inválidas.
 */
public class ValidacaoOperacaoException extends RuntimeException {

  public ValidacaoOperacaoException(String message) {
    super(message);
  }
}
