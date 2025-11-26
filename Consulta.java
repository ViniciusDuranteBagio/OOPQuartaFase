public class Consulta {
    private Animal animal;
    private String tipoAtendimento;
    private String doenca;

    public Consulta(Animal animal, String tipoAtendimento, String doenca) {
        this.animal = animal;
        this.tipoAtendimento = tipoAtendimento;
        this.doenca = doenca;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    @Override
    public String toString() {
        String tipoAnimal;

        if (animal instanceof Cachorro) {
            tipoAnimal = "Cachorro";
        } else if (animal instanceof Gato) {
            tipoAnimal = "Gato";
        } else if (animal instanceof Coelho) {
            tipoAnimal = "Coelho";
        } else {
            tipoAnimal = "Desconhecido";
        }

        return "Nome: " + animal.getNome()
                + " | Tipo de animal: " + tipoAnimal
                + " | Idade: " + animal.getIdade()
                + " | Raca: " + animal.getRaca()
                + " | Tipo de atendimento: " + tipoAtendimento
                + " | Doenca: " + (doenca == null ? "Nenhuma" : doenca);
    }
}
