
// Representa uma consulta da agenda
public class Consulta {

    private Animal animal;  // composição: consulta contém um animal
    private String tipo;    // Banho, Tosa, Consulta etc.
    private String doenca;  // só se for consulta

    public Consulta(Animal animal, String tipo, String doenca) {
        this.animal = animal;
        this.tipo = tipo;
        this.doenca = doenca;
    }

    @Override
    public String toString() {
        return "Animal: " + animal +
                " | Tipo: " + tipo +
                (doenca != null ? " | Doença: " + doenca : "");
    }
}
