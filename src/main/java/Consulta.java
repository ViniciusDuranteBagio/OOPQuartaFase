public class Consulta {

    private Animal animal;
    private String tipo;
    private String doenca; // null se não for consulta/doente

    public Consulta(Animal animal, String tipo, String doenca) throws ValidacaoException {
        if (animal == null) throw new ValidacaoException("Animal não pode ser nulo.");
        if (tipo == null) throw new ValidacaoException("Tipo de atendimento obrigatório.");
        this.animal = animal;
        this.tipo = tipo;
        if (tipo.toLowerCase().equals("consulta")) {
            if (doenca == null || doenca.trim().isEmpty()) {
                throw new ValidacaoException("Para atendimento do tipo CONSULTA, informe a doença.");
            }
            // opcional: verificar se a doença está na lista do animal
            boolean encontrada = false;
            for (String d : animal.getDoencasPossiveis()) {
                if (d.equalsIgnoreCase(doenca.trim())) {
                    encontrada = true;
                    break;
                }
            }
            if (!encontrada) {
                // permitimos, mas avisamos via exceção (requisito: doença deve ser buscada nas possíveis)
                throw new ValidacaoException("Doença informada não consta das doenças possíveis para este animal.");
            }
            this.doenca = doenca.trim();
        } else {
            this.doenca = null;
        }
    }

    @Override
    public String toString() {
        String base = String.format("[%s] %s", tipo, animal.toString());
        if (tipo.toLowerCase().equals("consulta")) {
            base += String.format(" - Doença: %s", doenca);
        }
        return base;
    }
}