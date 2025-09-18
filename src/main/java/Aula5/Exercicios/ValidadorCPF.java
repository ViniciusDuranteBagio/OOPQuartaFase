package Aula5.Exercicios;

public class ValidadorCPF implements Validador {
    @Override
    public boolean validar(String valor) {
        return valor != null && valor.length() == 11;
    }
}