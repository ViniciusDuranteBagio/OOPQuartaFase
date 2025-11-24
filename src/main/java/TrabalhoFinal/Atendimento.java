package TrabalhoFinal;

public class Atendimento {

    private String tipo;

    public Atendimento(String tipo) throws ValidacaoException {
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new ValidacaoException("Tipo de atendimento inválido.");
        }
        this.tipo = tipo.trim();
    }

    public String getTipo() {
        return tipo;
    }
}