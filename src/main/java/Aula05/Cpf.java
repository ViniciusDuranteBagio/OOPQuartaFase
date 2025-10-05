package Aula05;

public class Cpf implements Validar {

    @Override
    public boolean validar(String valor) {
        return valor != null && valor.length() == 11 && valor.matches("\\d+");
    }
}
