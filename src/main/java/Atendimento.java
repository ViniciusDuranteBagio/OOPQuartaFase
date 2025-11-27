public class Atendimento {
    private Animal animal;
    private String tipoAtendimento;
    private String dataHora;

    public Atendimento(Animal animal, String tipoAtendimento, String dataHora) {
        this.animal = animal;
        this.tipoAtendimento = tipoAtendimento;
        this.dataHora = dataHora;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public String getDataHora() {
        return dataHora;
    }

    public String gerarResumo() {
        String texto = "=== Atendimento === \nTipo: " + tipoAtendimento + "\nHorário: " + dataHora +
                "\n" + animal.toString() + "\n-----------------------\n";
        return texto;
    }

    @Override
    public String toString() {
        return gerarResumo();
    }
}