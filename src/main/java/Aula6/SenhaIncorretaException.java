package Aula6;


class SenhaIncorretaException extends Exception {
    public SenhaIncorretaException(String mensagem) {
        super(mensagem);
    }
}