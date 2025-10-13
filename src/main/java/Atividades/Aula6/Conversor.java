package Atividades.Aula6;

public class Conversor {

        public int converterParaInteiro(String texto) {
            try {
                return Integer.parseInt(texto);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Entrada inválida. Por favor, digite um número inteiro.");
            }
        }
}
