package Aula05;

public class Cnpj implements Validar {
    @Override
    public boolean validar(String valor) {
        return valor != null && valor.matches("\\d{14}");
    }
}
