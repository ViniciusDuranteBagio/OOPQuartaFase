package exercicios;

class ValidadorCPF implements Validador {
    @Override
    public boolean validar(String cpf) {
        return cpf != null && cpf.length() == 11;
    }
}
