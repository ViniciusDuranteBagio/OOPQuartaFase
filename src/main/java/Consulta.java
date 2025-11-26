public class Consulta {

    private Animal animal;
    private String tipoAtendimento;
    private String doenca;
    private String data; // Atributo Data

    public Consulta(Animal animal, String tipoAtendimento, String doenca, String data) {
        this.animal = animal;
        this.tipoAtendimento = tipoAtendimento;
        this.doenca = doenca;
        this.data = data;
    }

    // --- ADICIONE ESTE MÉTODO AQUI ---
    public String getData() {
        return data;
    }
    // ---------------------------------

    @Override
    public String toString() {
        String detalhes = "Data: " + data + "\n" +
                "Atendimento: " + tipoAtendimento + "\n" +
                "Animal: [" + animal.toString() + "]";

        if (doenca != null && !doenca.isEmpty()) {
            detalhes += "\nDoença: " + doenca;
        }

        return detalhes + "\n--------------------";
    }
}