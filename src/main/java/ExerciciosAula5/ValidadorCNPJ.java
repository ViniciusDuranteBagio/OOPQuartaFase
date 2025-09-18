package ExerciciosAula5;

public class ValidadorCNPJ implements Validador {
    @Override
    public boolean validar(String valor) {
        // Lógica simplificada
        return valor != null && valor.matches("\\d{14}");
    }
}