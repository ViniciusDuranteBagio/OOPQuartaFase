public class ValidarEntrada {
    public static String lerLinha() {
        String linha = "";
        try {
            int caractere;
            while ((caractere = System.in.read()) != -1) {
                if (caractere == '\n' || caractere == '\r') {
                    break;
                }
                linha += (char) caractere;
            }
        } catch (Exception e) {
            System.out.println("Erro de leitura.");
        }
        return linha.trim();
    }
}