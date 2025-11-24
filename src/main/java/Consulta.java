public class Consulta {
    private Animal animal;
    private String tipo;
    private String doenca;

    public Consulta(Animal animal, String tipo, String doenca) {
        this.animal = animal;
        this.tipo = tipo;
        this.doenca = doenca;
    }

    @Override
    public String toString() {
        String base = animal.getNome() + " (" + animal.getClass().getSimpleName() + ") - " + tipo;
        if (doenca != null) {
            return base + " - Doença: " + doenca;
        }
        return base;
    }
}