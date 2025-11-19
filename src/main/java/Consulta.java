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
        String texto = "Animal: " + animal + " | Tipo: " + tipo;
        if (doenca != null) texto += " | Doença: " + doenca;
        return texto;
    }
}
