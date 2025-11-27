public class Consulta {

    //Atributos
    private Animal animal;
    private String tipoAtendimento;
    private String doenca;

    //Validações
    public void setTipoAtendimento(String tipoAtendimento) throws ValidacaoException {

        if (tipoAtendimento == null || tipoAtendimento.trim().isEmpty()) {
            throw new ValidacaoException("Tipo de Atendimento inválido!");
        }

        if (!tipoAtendimento.equals("Banho")
                && !tipoAtendimento.equals("Tosa")
                && !tipoAtendimento.equals("Banho e Tosa")
                && !tipoAtendimento.equals("Consulta")) {

            throw new ValidacaoException("Tipo de Atendimento inválido!");
        }

        this.tipoAtendimento = tipoAtendimento;
    }

    // Construtor
    public Consulta(Animal animal, String tipoAtendimento, String doenca) throws ValidacaoException {
        this.animal = animal;
        setTipoAtendimento(tipoAtendimento);
        setDoenca(doenca);
    }

    // setDoenca teste

    public void setDoenca(String doenca) throws ValidacaoException {

        // Se nao for Consulta, não valida doença
        if (!tipoAtendimento.equals("Consulta")) {
            this.doenca = null;
            return;
        }

        // Se for Consulta, a doença deve estar preenchida
        if (doenca == null || doenca.trim().isEmpty()) {
            throw new ValidacaoException("A doença deve ser informada para consultas!");
        }

        String[] listaDoencas = animal.getDoencasComuns();

        boolean encontrada = false;

        // Procura a doença dentro do array
        for (int i = 0; i < listaDoencas.length; i++) {
            if (listaDoencas[i].equals(doenca)) {
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            throw new ValidacaoException("Doença inválida para este tipo de animal!");
        }

        this.doenca = doenca;
    }
    @Override
    public String toString() {
        return "Tipo de Atendimento: " + tipoAtendimento +
                "\n Doença: " + (doenca == null ? "Nenhuma" : doenca) +
                "\n Animal: [" + animal.toString() + "]";
    }

}
