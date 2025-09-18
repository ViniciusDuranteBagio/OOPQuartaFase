package Aula5.Atividade;

public class ValidadorEmail implements IValidador{
    private static final String REGEX_EMAIL = "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$";

    @Override
    public boolean validar(String valor) {
        return valor != null && valor.matches(REGEX_EMAIL);
    }
}
