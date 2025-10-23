package Aula6;

public class ValidadorDocumento {
    public void validarCPF(String cpf) throws DocumentoInvalidoException {
        if (cpf == null || !cpf.matches("\\d{11}")) {
            throw new DocumentoInvalidoException("CPF inválido! Deve conter 11 dígitos.");
        }
    }
}
