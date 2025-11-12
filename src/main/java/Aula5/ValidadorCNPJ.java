package Aula5;

public class ValidadorCNPJ implements Validador {
    @Override
    public boolean validar(String valor) {
        return valor != null && valor.matches("\\d{14}");
    }
}
