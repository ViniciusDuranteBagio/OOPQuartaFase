package AgendaVeterinario.exception;

public class LimiteConsultaException extends RuntimeException{
    public LimiteConsultaException(String mensagem){
        super(mensagem);
    }
}
