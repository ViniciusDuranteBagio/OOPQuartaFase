public class Consulta {
    public enum TipoAtendimento {
        BANHO, TOSA, BANHO_E_TOSA, CONSULTA
    }

    private Animal animal;
    private TipoAtendimento tipo;
    private String doenca;

    public Consulta(Animal animal, TipoAtendimento tipo) {
        this.animal = animal;
        this.tipo = tipo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public TipoAtendimento getTipo() {
        return tipo;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    @Override
    public String toString() {
        String base = String.format("%s - Atendimento: %s", animal.toString(), tipo);
        if (tipo == TipoAtendimento.CONSULTA) {
            String d = (doenca == null || doenca.isBlank()) ? "Não informado" : doenca;
            base += String.format(" - Doença: %s", d);
        }
        return base;
    }
}
