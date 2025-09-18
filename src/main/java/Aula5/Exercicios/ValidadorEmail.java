package Aula5.Exercicios;

public class ValidadorEmail implements Validador {
    @Override
    public boolean validar(String valor) {
        return valor != null && valor.contains("@");
    }
}