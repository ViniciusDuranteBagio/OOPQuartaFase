package AgendaVeterinario.exception;

public class AtendimentoInvalidoException extends RuntimeException{
    public AtendimentoInvalidoException (String mensagem){
        super(mensagem);
    }
}
