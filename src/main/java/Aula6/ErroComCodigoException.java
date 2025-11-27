public class ErroComCodigoException extends Exception {
    private int codigo;
    public ErroComCodigoException(String msg, int codigo) {
        super(msg);
        this.codigo = codigo;
    }
    public int getCodigo() { return codigo; }
}