// Define a exceção personalizada, estendendo Exception
public class ValidacaoException extends Exception {
    // Construtor que aceita uma mensagem de erro
    public ValidacaoException(String message) {
        super(message);
    }
}