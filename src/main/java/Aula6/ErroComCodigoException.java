package Aula6;

public class ErroComCodigoException extends Exception {
    private int codigo;

    public ErroComCodigoException(String message, int codigo) {
        super(message);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

}
