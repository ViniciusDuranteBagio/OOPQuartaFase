package Atividades_Aula_5;

class ValidadorCNPJ implements Validador {
    @Override
    public boolean validar(String valor) {

        return valor != null && valor.matches("\\d{14}");
    }
}