package org.example;

public class ValidadorCNPJ implements Validador {
    @Override
    public boolean validar(String valor) {
        return valor != null && valor.matches("\\d{14}");
    }
}
