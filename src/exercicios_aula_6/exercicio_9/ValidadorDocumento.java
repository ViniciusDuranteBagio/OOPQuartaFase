package exercicios_aula_6.exercicio_9;

class ValidadorDocumento {

    public boolean validar(String valor) {
        return valor != null && valor.length() == 11;
    }
}