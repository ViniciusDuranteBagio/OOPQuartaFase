package exercicios;

class ValidadorCNPJ implements Validador {
    @Override
    public boolean validar(String cnpj) {
        return cnpj != null && cnpj.length() == 14;
    }
}
