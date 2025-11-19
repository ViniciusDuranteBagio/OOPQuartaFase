package TrabalhoFinal;

public class Validacao {
    public static boolean validarNome(String nome) {
        return nome.matches("[a-zA-Z\\s]{2,}");
    }

    public static boolean validarIdade(int idade) {
        return idade > 0;
    }

    public static boolean validarRaca(String raca) {
        return !raca.trim().isEmpty();
    }
}