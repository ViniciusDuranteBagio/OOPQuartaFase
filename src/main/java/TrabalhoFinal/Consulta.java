package TrabalhoFinal;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class Consulta {
    private Animal animal;
    private Atendimento atendimento;
    private String data;
    private String doenca;

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd/MM/uuuu")
                    .withResolverStyle(ResolverStyle.STRICT);

    public Consulta(Animal animal, Atendimento atendimento, String data, String doenca) throws ValidacaoException {
        if (animal == null) throw new ValidacaoException("Animal está inválido. Tente novamente");

        if (atendimento == null) throw new ValidacaoException("Atendimento inválido");

        if (data == null || data.trim().isEmpty()) throw new ValidacaoException("Data inválida");
        try {
            LocalDate.parse(data.trim(), FORMATTER);
        } catch (DateTimeException e) {
            throw new ValidacaoException("Data inválida. Usar o formato 'DD/MM/YYYY'");

        }

        if (atendimento.getTipo().equalsIgnoreCase("Tratamento")) {
            if (doenca == null || doenca.trim().isEmpty()) throw new ValidacaoException("Doença inválida");
        }


        this.animal = animal;
        this.atendimento = atendimento;
        this.data = data.trim();
        this.doenca = doenca;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public String getData() {
        return data;
    }

    public String getDoenca() {
        return doenca;
    }
}
