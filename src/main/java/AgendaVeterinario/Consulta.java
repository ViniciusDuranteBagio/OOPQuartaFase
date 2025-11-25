package AgendaVeterinario;

public class Consulta {
    private Animal animal;
    private String tipoAtendimento;
    private String tipoDoenca;

    public Consulta() { }

    public Consulta(Animal animal, String tipoAtendimento, String tipoDoenca) {
        this.animal = animal;
        this.tipoAtendimento = tipoAtendimento;
        this.tipoDoenca = tipoDoenca;
    }

    @Override
    public String toString() {
        if (tipoAtendimento.equals("Consulta")) {
            return animal.toString() + " - " + tipoAtendimento + " (Doença: " + tipoDoenca + ")";
        }
        return animal.toString() + " - " + tipoAtendimento;
    }
}
