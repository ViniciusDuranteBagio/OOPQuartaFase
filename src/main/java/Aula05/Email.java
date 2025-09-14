package Aula05;

public class Email implements Validar {
    @Override
    public boolean validar(String valor) {
        return valor != null && valor.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }
}

