public class Validador {

    public static void conferirNome(String nome) throws ValidacaoException {
        if (nome == null || !nome.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]{2,}")) {
            throw new ValidacaoException("Nome inválido. É necessário usar apenas letras e no mínimo 2 caracteres.");
        }
    }

    public static void conferirIdade(int idade) throws ValidacaoException {
        if (idade < 1) {
            throw new ValidacaoException("A idade precisa ser maior que zero.");
        }
    }
}