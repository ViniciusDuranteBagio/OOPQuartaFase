package Atividades_Aula_6;

public class ValidadorDocumento {

    public void validarCPF(String cpf) throws DocumentoInvalidoException {
        if (cpf == null || cpf.length() != 11 || !cpf.matches("\\d{11}")) {
            throw new DocumentoInvalidoException("CPF inválido. Deve conter 11 números.");
        }
    }

    public static void main(String[] args) {
        ValidadorDocumento validador = new ValidadorDocumento();
        try {
            validador.validarCPF("12345678901");
            System.out.println("CPF válido");
            validador.validarCPF("123");
        } catch (DocumentoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}