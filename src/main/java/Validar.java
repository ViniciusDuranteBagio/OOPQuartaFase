public class Validar {
    public static void validarNome(String nmAnimal) throws ValidacaoException {
        if (nmAnimal == null || nmAnimal.trim().length() < 2) {
            throw new ValidacaoException("O nome deve ser uma palavra");
        }
        if (!nmAnimal.matches("^[A-Za-zÀ-ÿ ]+$")) {
            throw new ValidacaoException("O nome deve conter apenas letras e espaços");
        }
    }
    public static void validarraça(String raça) throws ValidacaoException {
        if (raça == null || raça.trim().isEmpty()) {
            throw new ValidacaoException("A raça deve ser informada.");
        }
    }
    public static double validarIdade(double idade) throws ValidacaoException {
        if (idade <= 0) {
            throw new ValidacaoException("A idade deve ser um número positivo, no" +
                    " formato(anos,meses).");
        }
        return idade;
    }
}
