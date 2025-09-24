package ClasseAbstrata;

public class ValidadorEmail extends Validador {
    @Override
    public boolean validar(String valor) {
        return valor != null && valor.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$");
    }
}
