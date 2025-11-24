package Trabalho_final;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Consulta> consultas;
    private static final int MAX_CONSULTAS = 10;

    public Agenda() {
        this.consultas = new ArrayList<>();
    }

    public void adicionarConsulta(Consulta consulta) throws ValidacaoException {
        if (consultas.size() >= MAX_CONSULTAS) {
            throw new ValidacaoException("Agenda cheia. Não há mais horários disponíveis.");
        }
        consultas.add(consulta);
    }

    public List<Consulta> listarConsultas() {
        return new ArrayList<>(consultas);
    }

    public int getNumeroConsultas() {
        return consultas.size();
    }
}
