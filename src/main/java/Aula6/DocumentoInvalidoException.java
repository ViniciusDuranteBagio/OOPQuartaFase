package Aula6;

public class DocumentoInvalidoException extends RuntimeException {
    public DocumentoInvalidoException(String mensagem) {
        super(mensagem);
    }
}