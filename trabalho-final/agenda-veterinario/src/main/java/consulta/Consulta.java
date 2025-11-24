package consulta;

import animal.Animal;

public class Consulta {

    public enum TipoAtendimento {
        BANHO, TOSA, BANHO_TOSA, CONSULTA
    }

    private Animal animal;
    private TipoAtendimento tipo;
    private String doenca;

    public Consulta(Animal animal, TipoAtendimento tipo, String doenca) {
        this.animal = animal;
        this.tipo = tipo;
        this.doenca = doenca;
    }

    @Override
    public String toString() {
        if (tipo == TipoAtendimento.CONSULTA) {
            return animal + " - " + tipo + " (Doença: " + doenca + ")";
        }
        return animal + " - " + tipo;
    }
}
