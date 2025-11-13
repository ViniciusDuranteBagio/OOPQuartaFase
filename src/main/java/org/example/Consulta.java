package org.example;

public class Consulta {

    private Animal animal;
    private TipoAtendimento tipoAtendimento;
    private String doenca;

    public Consulta(Animal animal, TipoAtendimento tipoAtendimento, String doenca) {
        this.animal = animal;
        this.tipoAtendimento = tipoAtendimento;
        this.doenca = doenca;
    }

    public Animal getAnimal() {
        return animal;
    }

    public TipoAtendimento getTipoAtendimento() {
        return tipoAtendimento;
    }

    public String getDoenca() {
        return doenca;
    }

    @Override
    public String toString() {
        String base = "Animal: " + animal +
                " | Tipo de atendimento: " + tipoAtendimento;
        if (tipoAtendimento == TipoAtendimento.CONSULTA && doenca != null && !doenca.isBlank()) {
            base += " | Doença: " + doenca;
        }
        return base;
    }
}
