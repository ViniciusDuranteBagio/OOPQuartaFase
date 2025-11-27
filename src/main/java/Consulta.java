class Consulta {

    private Animal animal;
    private String tipoConsulta;
    private String doenca;

    public Consulta(Animal animal, String tipoConsulta, String doenca) {

        this.animal = animal;
        this.tipoConsulta = tipoConsulta;
        this.doenca = doenca;
    }
    @Override
    public String toString() {
        return "COnsulta: " + tipoConsulta +
                "\nAnimal: " + animal +
                (doenca != null ? "\nDoenca: " + doenca : "\nSem doença registrada");
    }
}
