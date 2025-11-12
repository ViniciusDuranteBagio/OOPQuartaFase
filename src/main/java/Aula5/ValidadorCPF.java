package Aula5;

public class ValidadorCPF implements Validador {
    @Override
    public boolean validar(String valor) {
        return valor != null && valor.matches("\\d{11}");
    }
}
