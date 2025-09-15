package AtividadesAula05;

public class ValidadorCNPJ implements Validador {
    @Override
    public boolean validar(String valor) {
        return valor.length() == 14;
    }

}
