public class Consulta {

    private Animal paciente;
    private String atendimento;
    private String enfermidade;

    public Consulta(Animal paciente, String atendimento, String enfermidade) {
        this.paciente = paciente;
        this.atendimento = atendimento;
        this.enfermidade = enfermidade;
    }

    public Animal getPaciente() {
        return paciente;
    }

    public String getAtendimento() {
        return atendimento;
    }

    public String getEnfermidade() {
        return enfermidade;
    }

    @Override
    public String toString() {
        String base = paciente.toString() + " | Atendimento: " + atendimento;
        if (enfermidade != null && !enfermidade.isBlank()) {
            base += " | Doença: " + enfermidade;
        }
        return base;
    }
}
