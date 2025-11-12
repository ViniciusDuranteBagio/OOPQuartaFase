package Aula5;

public class ValidadorEmail implements Validador {
    @Override
    public boolean validar(String valor) {
        return valor != null && valor.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }
}