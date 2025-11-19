public class Consulta {
    private Animal animal;
    private String tipoAtendimento;
    private String disease;

    public Consulta(Animal animal, String tipoAtendimento, String disease) {
        this.animal = animal;
        this.tipoAtendimento = tipoAtendimento;
        this.disease = disease;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public String getDisease() {
        return disease;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Animal: " + animal.getName()
                + " | Tipo  do atendimento: " + tipoAtendimento
                + " | Doenca: " + (disease == null ? "Nenhuma" : disease);
    }
}
