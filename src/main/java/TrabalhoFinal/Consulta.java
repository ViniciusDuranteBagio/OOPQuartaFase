package TrabalhoFinal;

class Consulta {
    private Animal animal;
    private String tipoAtendimento;
    private String doenca;

    public Consulta(Animal animal, String tipoAtendimento, String doenca) {
        this.animal = animal;
        this.tipoAtendimento = tipoAtendimento;
        this.doenca = doenca;
    }

    @Override
    public String toString() {
        String texto = "Animal: " + animal + "\nAtendimento: " + tipoAtendimento;
        if (tipoAtendimento.equalsIgnoreCase("Consulta") && doenca != null)
            texto += "\nDoença: " + doenca;
        return texto;
    }
}
