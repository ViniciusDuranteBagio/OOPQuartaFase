public class Consulta {
    private Animal animal;
    private String tipo;
    private String doenca; // opcional

    public Consulta(Animal animal, String tipo, String doenca) {
        this.animal = animal;
        this.tipo = tipo;
        this.doenca = doenca;
    }

    @Override
    public String toString() {
        String info = "[ " + tipo + " ] - " + animal.toString();
        if (doenca != null) info += " | Doença: " + doenca;
        return info;
    }
}
