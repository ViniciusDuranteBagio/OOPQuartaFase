package Atividades.Aula6;

public class ValidadorDocumento {

    public void validarCPF(String cpf) throws DocumentoInvalidoException {
        if (cpf == null || cpf.trim().isEmpty() || cpf.length() != 11 || !cpf.matches("\\d{11}")) {
            throw new DocumentoInvalidoException("Erro: CPF inválido. Deve conter exatamente 11 dígitos numéricos.");
        }
    }
}
