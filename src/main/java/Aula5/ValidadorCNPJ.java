public class ValidadorCNPJ implements Validador {
    public boolean validar(String valor) {
        return valor.length() == 14;
    }
}
