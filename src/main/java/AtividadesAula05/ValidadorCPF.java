package AtividadesAula05;

public class ValidadorCPF implements Validador {

    @Override
    public boolean validar(String valor) {
        return valor.length() == 11;
    }
}
