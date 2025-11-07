package aula06;

public class SenhaIncorretaException extends Exception {
    public SenhaIncorretaException(String mensagem) {
        super(mensagem);
    }
}
