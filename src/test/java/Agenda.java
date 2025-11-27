import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Consulta> consultas = new ArrayList<>();

    public void adicionar(Consulta c) throws ValidacaoException {
        if (consultas.size() >= 10)
            throw new ValidacaoException("Agenda cheia! Máximo de 10 consultas.");
        consultas.add(c);
    }

    public List<Consulta> listar() {
        return consultas;
    }

    public boolean vazia() {
        return consultas.isEmpty();
    }
}
