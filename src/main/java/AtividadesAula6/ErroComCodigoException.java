package AtividadesAula6;

public class ErroComCodigoException extends Exception{
    public  ErroComCodigoException(String mensagem, int codigo){
        super("Erro número " + codigo + ": " + mensagem);
    }
}
