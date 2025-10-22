package Aula6;

class UsuarioNaoEncontradoException extends Exception {
    public UsuarioNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}