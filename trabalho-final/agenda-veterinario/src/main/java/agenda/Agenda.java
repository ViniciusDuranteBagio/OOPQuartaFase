package agenda;

import consulta.Consulta;
import validacao.ValidacaoException;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Consulta> consultas = new ArrayList<>();

    public void adicionar(Consulta consulta) throws ValidacaoException {

        if (consultas.size() >= 10) {
            throw new ValidacaoException("Agenda cheia! Máximo de 10 consultas.");
        }

        consultas.add(consulta);
    }

    public List<Consulta> listar() {
        return consultas;
    }
}
