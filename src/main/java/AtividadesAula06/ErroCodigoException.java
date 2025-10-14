package AtividadesAula06;

class ErroCodigoException extends Exception {
    private int codigo;

    public ErroCodigoException(String mensagem, int codigo) {
        super(mensagem);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}