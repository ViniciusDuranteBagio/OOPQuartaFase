package AgendaVeterinario.exception;

public class DoencaInexistenteException extends RuntimeException{
    public DoencaInexistenteException(String mensagem){
        super(mensagem);
    }
}
