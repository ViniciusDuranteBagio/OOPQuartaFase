package TrabalhoFinal;

public class Consulta {

    private Animal animal;
    private String tipo;
    private String doenca;

    public Consulta(Animal animal, String tipo, String doenca) {
        this.animal = animal;
        this.tipo = tipo;
        this.doenca = doenca;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDoenca() {
        return doenca;
    }

    @Override
    public String toString() {
        return "Animal: " + animal.getNome()
                + " | Tipo: " + tipo
                + (doenca != null ? " | Doença: " + doenca : "");
    }
}
