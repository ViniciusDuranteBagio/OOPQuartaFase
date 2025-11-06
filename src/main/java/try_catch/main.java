package try_catch;

public class main {
    public static void main(String[] args) {

        try {
            verificarIdade(15); // chama o método que pode lançar erro
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        System.out.println("Programa continua funcionando normalmente!");
    }

    // Método auxiliar, estático para poder ser chamado no main
    public static void verificarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade mínima é 18 anos!");
        }
        System.out.println("Acesso permitido!");

    }
}
