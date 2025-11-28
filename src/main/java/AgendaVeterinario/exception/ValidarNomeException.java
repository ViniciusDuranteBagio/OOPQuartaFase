package AgendaVeterinario.exception;

public class ValidarNomeException extends RuntimeException {
    public ValidarNomeException (String mensagem){
        super(mensagem);
    }
}
