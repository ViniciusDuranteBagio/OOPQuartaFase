package exercicios_13;

class ErroComCodigoException extends Exception {
    private int codigo;

    public ErroComCodigoException(String mensagem, int codigo) {
        super(mensagem);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}