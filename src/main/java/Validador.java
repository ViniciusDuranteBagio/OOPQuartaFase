public class Validador {

    public static void validarNome(String nome) throws ValidacaoException {
        if (nome == null || !nome.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]{2,}")) {
            throw new ValidacaoException("Nome inválido! Use apenas letras e pelo menos 2 caracteres.");
        }
    }

    public static void validarIdade(int idade) throws ValidacaoException {
        if (idade <= 0) {
            throw new ValidacaoException("Idade deve ser maior que 0.");
        }
    }
}
