package Aula6atv;

public class ErroComCodigoException extends RuntimeException {
    private int codigoErro;

    public ErroComCodigoException(int codigoErro, String mensagem) {
        super(mensagem); // passa a mensagem para a classe Exception
        this.codigoErro = codigoErro;
    }

    public int getCodigoErro() {
        return codigoErro;
    }
}
