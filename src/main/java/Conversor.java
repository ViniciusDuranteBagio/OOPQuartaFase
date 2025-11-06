public class Conversor {
    public void converterParaInteiro(String texto) {

            try {
                int numero = Integer.parseInt(texto);
                System.out.println("Número convertido com sucesso: " + numero);
            } catch (NumberFormatException e) {
                System.out.println("Erro: O valor '" + texto + "' não é um número inteiro válido.");
            }
    }
}
