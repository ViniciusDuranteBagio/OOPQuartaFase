package Aula06;

public class ValidadorDocumento {
    public void validarCpf(String cpf) throws DocumentoInvalidoException {
        if (cpf == null) throw new DocumentoInvalidoException("CPF nao pode ser nulo");
        String numeros = cpf.replace("\\D", "");
        if (!cpf.matches("\\d{11}"))
            throw new DocumentoInvalidoException("CPF invalido: precisa ter 11 numeros");
    }
}

