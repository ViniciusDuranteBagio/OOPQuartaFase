package Aula5.Exercicios;

public class ValidadorCNPJ implements Validador {
    @Override
    public boolean validar(String valor) {
        return valor != null && valor.length() == 14;
    }
}