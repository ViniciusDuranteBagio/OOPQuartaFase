public class Atendimento {
    private String tipo;

    public Atendimento(String tipo) throws FalhaException {
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new FalhaException("Tipo de atendimento inválido.");
        }
        this.tipo = tipo.trim();
    }

    public String getTipo() {
        return tipo;
    }
}

