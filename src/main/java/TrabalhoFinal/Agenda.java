package TrabalhoFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda {
    private final List<Consulta> consultas;
    private final int capacidade;

    public Agenda(int capacidade) {
        this.capacidade = capacidade;
        this.consultas = new ArrayList<>();
    }

    public Agenda() {
        this(10);
    }

    public void adicionarConsulta(Consulta c) throws ValidacaoException {
        if (consultas.size() >= capacidade) throw new ValidacaoException("Agenda cheia. Não há mais horários disponíveis.");
        consultas.add(c);
    }

    public List<Consulta> listarConsultas() {
        return Collections.unmodifiableList(consultas);
    }

    public int tamanho() {
        return consultas.size();
    }

    public int capacidade() {
        return capacidade;
    }

}
