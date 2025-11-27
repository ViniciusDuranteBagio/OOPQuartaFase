public class Consulta {
    private Animal animal;
    private String tipoAtendimento;
    private String doenca;

    public Consulta(Animal animal, String tipoAtendimento, String doenca) {
        this.animal = animal;
        this.tipoAtendimento = tipoAtendimento;
        this.doenca = doenca;
    }

    public Consulta(Animal animal, String tipoAtendimento) {
        this.animal = animal;
        this.tipoAtendimento = tipoAtendimento;
        this.doenca = null;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    @Override
    public String toString() {
        String tipoAnimal = animal.getClass().getSimpleName();
        String resultado = tipoAnimal + " | " + animal.getNome() + " | " + animal.getIdade() + " anos | " + tipoAtendimento;
        
        if (tipoAtendimento.equals("Consulta") && doenca != null) {
            resultado += ": " + doenca;
        }
        
        return resultado;
    }
}

