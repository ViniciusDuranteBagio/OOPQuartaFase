package org.example;

public enum TipoAtendimento {
    BANHO,
    TOSA,
    BANHO_E_TOSA,
    CONSULTA;

    public static TipoAtendimento fromOpcao(int opcao) throws ValidacaoException {
        switch (opcao) {
            case 1: return BANHO;
            case 2: return TOSA;
            case 3: return BANHO_E_TOSA;
            case 4: return CONSULTA;
            default: throw new ValidacaoException("Opção de atendimento inválida.");
        }
    }
}
