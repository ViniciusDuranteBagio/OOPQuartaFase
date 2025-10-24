package Aula6;
/*Crie erro personalizado com mensagem e código numérico. Mostre ambos ao usuário quando tratado.
 Classes a criar:
ErroComCodigoException
 */
public class ErroComCodigoException extends Exception {
    private int codigo;

    public ErroComCodigoException(String msg, int codigo) {
        super(msg);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
