package exercicio_6;

public class ValidadorCNPJ implements IValidador{
    @Override
    public boolean validar(String valor) {
        return valor != null && valor.length() == 14;
    }
}
