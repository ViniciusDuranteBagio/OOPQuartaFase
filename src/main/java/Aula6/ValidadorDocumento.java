package Aula6;
/*Validação de documento Valide um número de documento. Se for inválido, trate e mostre mensagem.
Classes a criar:
ValidadorDocumento.
DocumentoInvalidoException.
Exemplo: CPF tem que ter 11 numeros, se não tiver 11 está invalido.
 */

public class ValidadorDocumento {
    public void validarCPF(String cpf) throws DocumentoInvalidoException {
        if (cpf == null) {
            throw new DocumentoInvalidoException("CPF não pode ser nulo.");
        }
        if (cpf.length() != 11) {
            throw new DocumentoInvalidoException("Erro! CPF deve conter exatamente 11 dígitos.");
        }
        if (!cpf.matches("\\d{11}")) {
            throw new DocumentoInvalidoException("Erro! O CPF deve conter apenas números.");
        }
        System.out.println("CPF: " + cpf);
    }
}
