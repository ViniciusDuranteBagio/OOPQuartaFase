public class Consulta {
    private Animal animal;
    private String tipoAtendimento;
    private String doenca;

    public Consulta(Animal animal, String tipoAtendimento, String doenca) {
        this.animal = animal;
        this.tipoAtendimento = tipoAtendimento;
        this.doenca = doenca;
    }

    public Animal getAnimal() { return animal; }
    public String getTipoAtendimento() { return tipoAtendimento; }
    public String getDoenca() { return doenca; }

    @Override
    public String toString() {
        String info = "Animal: " + animal + " | Atendimento: " + tipoAtendimento;
        if (doenca != null && !doenca.isEmpty()) {
            info += " | Doença: " + doenca;
        }
        return info;
    }
}