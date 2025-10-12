package Aula06;

public class Conversor {

    public Integer converter(String valor) {
        try {
            int n = Integer.parseInt(valor);
            System.out.println("Valor convertido: " + n);
            return n;
        } catch (NumberFormatException e) {
            return null;
        } finally {
            System.out.println("Fim");
        }
    }
}
