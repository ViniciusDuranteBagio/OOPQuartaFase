package Aula6;

class ValidadorDocumento {

    public boolean validar(String valor) {
        return valor != null && valor.length() == 11;
    }
}