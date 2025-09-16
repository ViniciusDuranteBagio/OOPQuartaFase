package exercicios;

class ValidadorEmail implements Validador {
    @Override
    public boolean validar(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }
}
