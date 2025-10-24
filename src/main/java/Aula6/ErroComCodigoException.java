package Atvd_aula6;

public class ErroComCodigoException extends Exception{
    int cod;

    public ErroComCodigoException(String mensagem, int cod){
        super(mensagem);
        this.cod = cod;
    }
    public  int getCod(){
        return cod;
    }
}
