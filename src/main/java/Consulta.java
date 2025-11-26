public record Consulta(Animal animal, String tipoAtendimento, String doenca) {

    @Override
    public String toString() {

        String info =
                "Animal: " + animal.getNome() +
                        " (" + animal.getTipo() + ")\n" +
                        "Raça: " + animal.getRaca() + "\n" +
                        "Idade: " + animal.getIdade() + " anos\n" +
                        "Atendimento: " + tipoAtendimento;

        if (doenca != null && !doenca.isEmpty()) {
            info += "\nDoença: " + doenca;
        }

        return info;
    }
}
