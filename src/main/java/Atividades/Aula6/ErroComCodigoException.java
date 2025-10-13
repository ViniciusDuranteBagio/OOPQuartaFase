package Atividades.Aula6;

public class ErroComCodigoException extends Exception {
    private int codigoErro;

    public ErroComCodigoException(String message, int codigoErro) {
        super(message);
        this.codigoErro = codigoErro;
    }

    public int getCodigoErro() {
        return codigoErro;
    }
}
