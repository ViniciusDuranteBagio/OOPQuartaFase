package Exercicios_Aula5;

public class ValidadorEMAIL implements IValidador{
    @Override
    public boolean validar(String valor) {
        return valor != null && valor.contains("@") && valor.contains(".");
    }
}