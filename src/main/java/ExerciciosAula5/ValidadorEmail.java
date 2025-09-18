package ExerciciosAula5;

public class ValidadorEmail implements Validador {
    @Override
    public boolean validar(String valor) {
        // Lógica simplificada
        return valor != null && valor.contains("@") && valor.contains(".");
    }
}
