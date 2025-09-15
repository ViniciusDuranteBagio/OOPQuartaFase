package AtividadesAula05;

public class ValidadorEmail implements Validador {
    @Override
    public boolean validar(String valor) {
        return valor.contains("@");
    }

}
