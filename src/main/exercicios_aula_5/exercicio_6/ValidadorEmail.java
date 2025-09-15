package exercicio_6;

public class ValidadorEmail implements IValidador{
    @Override
    public boolean validar(String valor) {
        return valor != null && valor.contains("@") && valor.contains(".");
    }
}
