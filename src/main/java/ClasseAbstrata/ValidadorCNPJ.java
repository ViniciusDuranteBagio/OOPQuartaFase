package ClasseAbstrata;

public class ValidadorCNPJ extends Validador {
    @Override
    public boolean validar(String valor) {
        return valor != null && valor.matches("\\d{14}");
    }
}