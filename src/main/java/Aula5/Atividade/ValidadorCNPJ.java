package Aula5.Atividade;

public class ValidadorCNPJ implements IValidador{
    private static final String REGEX_CNPJ = "\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}";

    @Override
    public boolean validar(String valor) {
        return valor != null && valor.matches(REGEX_CNPJ);
    }
}
