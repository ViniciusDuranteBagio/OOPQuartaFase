public class ValidadorCPF implements Validador {
    public boolean validar(String valor) {
        return valor.length() == 11;
    }
}
