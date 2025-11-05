package org.example;

public class ValidadorDocumento {
    public void validarCPF(String cpf) throws DocumentoInvalidoException {
        if (cpf == null || !cpf.matches("\\d{11}")) {
            throw new DocumentoInvalidoException("CPF inválido! Deve conter 11 números.");
        }
        System.out.println("CPF válido: " + cpf);
    }
}
