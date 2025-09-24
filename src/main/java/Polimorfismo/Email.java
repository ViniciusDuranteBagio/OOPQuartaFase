package Polimorfismo;

public class Email implements Validador {
    @Override
    public void validar(String valor) {
        boolean b = valor != null && valor.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
        if (b == true) {
            System.out.println("Email valido");
        }else {
            System.out.println("Email invalido");
        }

    }
}
