package ClasseAbstrata;

public class ValidadorCPF extends Validador {
    @Override
    public boolean validar(String valor) {
        return valor != null && valor.matches("\\d{11}");
    }
}
