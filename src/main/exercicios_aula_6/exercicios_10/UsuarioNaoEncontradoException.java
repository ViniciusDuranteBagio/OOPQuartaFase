package exercicios_10;

class UsuarioNaoEncontradoException extends Exception {
    public UsuarioNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}