package Atividades_Aula_5;

class ValidadorEmail implements Validador {
    @Override
    public boolean validar(String valor) {

        return valor != null && valor.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$");
    }
}