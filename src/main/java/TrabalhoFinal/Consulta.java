public class Consulta {
    public enum TipoAtendimento { BANHO, TOSA, BANHO_E_TOSA, CONSULTA }

    private Animal animal;
    private TipoAtendimento tipo;
    private String doenca; // nullable

    public Consulta(Animal animal, TipoAtendimento tipo, String doenca) {
        this.animal = animal;
        this.tipo = tipo;
        this.doenca = doenca;
    }

    public Animal getAnimal() { return animal; }
    public TipoAtendimento getTipo() { return tipo; }
    public String getDoenca() { return doenca; }

    @Override
    public String toString() {
        String base = String.format("%s | Atendimento: %s", animal.toString(), tipoToString(tipo));
        if (tipo == TipoAtendimento.CONSULTA) {
            base += " | Doença: " + (doenca == null ? "não informada" : doenca);
        }
        return base;
    }

    private String tipoToString(TipoAtendimento t) {
        switch(t) {
            case BANHO: return "Banho";
            case TOSA: return "Tosa";
            case BANHO_E_TOSA: return "Banho e Tosa";
            case CONSULTA: return "Consulta";
        }
        return t.toString();
    }
}
