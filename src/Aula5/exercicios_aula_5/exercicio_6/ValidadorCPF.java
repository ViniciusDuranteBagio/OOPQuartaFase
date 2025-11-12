package exercicios_aula_5.exercicio_6;

public class ValidadorCPF implements IValidador{
    @Override
    public boolean validar(String valor) {
        return valor != null && valor.length() == 11;
    }
}
