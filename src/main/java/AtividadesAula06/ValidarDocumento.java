package AtividadesAula06;

import java.sql.SQLOutput;

public class ValidarDocumento {

    public static void validarCPF (String cpf) throws DocumentoInvalidoException {
        if (cpf == null || cpf.isEmpty()) {
            throw new DocumentoInvalidoException("ERRO. CPF INVALIDO OU NULO");

        }

        String cpfLimpo = cpf.replaceAll("\\D", " ");

        if (cpfLimpo.length() != 11 ) {
            throw new DocumentoInvalidoException("ERRO. DEVE CONTER EXATAMENTE 11 NUMEROS");
        }
        System.out.println("CPF válido: " + cpf);

    }
}
