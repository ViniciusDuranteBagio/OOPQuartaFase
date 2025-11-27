enum TipoAtendimento {
    BANHO("Banho"),
    TOSA("Tosa"),
    BANHO_E_TOSA("Banho e Tosa"),
    CONSULTA("Consulta");

    private String descricao;

    TipoAtendimento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}