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
        return "Animal: " + animal.getNome() +
                " | Tipo: " + tipo +
                (doenca != null ? " | Doença: " + doenca : "");
    }
}


