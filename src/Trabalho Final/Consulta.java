public class Consulta {

    private Animal animal;
    private String atendimento;
    private String doenca;

    public Consulta(Animal animal, String atendimento, String doenca) {
        this.animal = animal;
        this.atendimento = atendimento;
        this.doenca = doenca;
    }

    @Override
    public String toString() {
        String texto = animal.getNome() + " (" + animal.getClass().getSimpleName() + ") - "
                + atendimento;

        if (doenca != null) {
            texto += " | Doença: " + doenca;
        }

        return texto + " | Raça: " + animal.getRaca() + " | Idade: " + animal.getIdade();
    }
}
