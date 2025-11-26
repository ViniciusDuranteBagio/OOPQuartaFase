public class Consulta {
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
        String dadosConsulta = String.format(
                "  Animal: %s\n" +
                        "  Tipo: %s\n" +
                        "  Atendimento: %s",
                animal.toString(),
                tipoAtendimento,
                doenca != null && !doenca.isEmpty() ? "Doença: " + doenca : "Status: OK"
        );
        return dadosConsulta;
    }
}