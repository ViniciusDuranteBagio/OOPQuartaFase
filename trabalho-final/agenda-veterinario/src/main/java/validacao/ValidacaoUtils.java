package validacao;

public class ValidacaoUtils {

    public static void validarNome(String nome) throws ValidacaoException {
        if (nome.trim().length() < 2 || !nome.matches("[A-Za-zÀ-ú ]+")) {
            throw new ValidacaoException("Nome inválido.");
        }
    }

    public static void validarIdade(int idade) throws ValidacaoException {
        if (idade <= 0) {
            throw new ValidacaoException("Idade deve ser positiva.");
        }
    }

    public static void validarRaca(String raca) throws ValidacaoException {
        if (raca.trim().isEmpty()) {
            throw new ValidacaoException("Raça deve ser informada.");
        }
    }
}
