public class Conversor {
    public int converter(String texto) {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Valor digitado não é um número inteiro!");
        }
    }
}