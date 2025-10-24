package Atvd_aula6;

public class Conversor {

    public int converter (String valor){
        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e){
            System.out.println("Valor inválido.");
            return -1;
        }
    }
}
