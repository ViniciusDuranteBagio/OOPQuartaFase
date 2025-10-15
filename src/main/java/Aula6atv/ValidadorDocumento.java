package Aula6atv;

public class ValidadorDocumento {

    public void validarCPF(String cpf) throws DocumentoInvalidoException {
        // Remove espaços e possíveis caracteres não numéricos
        cpf = cpf.trim();

        if (!cpf.matches("\\d{11}")) {
            throw new DocumentoInvalidoException("CPF inválido! O CPF deve conter exatamente 11 números.");
        }
    }


}
