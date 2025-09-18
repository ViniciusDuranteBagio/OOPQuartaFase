package Aula5.Atividade;

public class ValidadorCPF implements IValidador{
    private static final String REGEX_CPF = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";

    @Override
    public boolean validar(String valor) {
        return valor != null && valor.matches(REGEX_CPF);
    }
}
