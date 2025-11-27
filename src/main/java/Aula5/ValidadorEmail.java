public class ValidadorEmail implements Validador {
    public boolean validar(String valor) {
        return valor.contains("@");
    }
}
