package AgendaVeterinario.model;

import AgendaVeterinario.exception.AtendimentoInvalidoException;
import AgendaVeterinario.exception.DoencaInexistenteException;

import java.time.LocalDate;

public class Consulta {

    private String tipoAtendimento;
    private String doenca;
    private Animal animal;
    private LocalDate data;

    public Consulta (Animal animal, String tipoAtendimento, String doenca, LocalDate data) {
        this.tipoAtendimento = tipoAtendimento;
        this.doenca = doenca;
        this.animal = animal;
        this.data = data;

        if (!tipoAtendimento.equals("Banho")
                && !tipoAtendimento.equals("Tosa")
                && !tipoAtendimento.equals("Banho e Tosa")
                && !tipoAtendimento.equals("Consulta"))
        {
            throw new AtendimentoInvalidoException("Tipo de Atendimento Inválido!");
        }

        if (tipoAtendimento.equals("Consulta")) {
            animal.getDoencas();

            if (!animal.getDoencas().contains(doenca)) {
                throw new DoencaInexistenteException("Doença inválida para esse animal!");
            }
            this.doenca = doenca;
        } else {
            this.doenca = null;
        }

    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public String getDoenca() {
        return doenca;
    }

    public Animal getAnimal() {
        return animal;
    }

    public LocalDate getData() {
        return data;
    }
}





