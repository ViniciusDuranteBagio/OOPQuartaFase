import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private final int CAPACIDADE = 10;
    private List<Consulta> consultas = new ArrayList<>();

    public void adicionarConsulta(Consulta c) throws ValidacaoException {
        if (consultas.size() >= CAPACIDADE) {
            throw new ValidacaoException("Agenda cheia: não há mais horários disponíveis.");
        }
        consultas.add(c);
    }

    public List<Consulta> listar() { return new ArrayList<>(consultas); }

    public boolean estaCheia() { return consultas.size() >= CAPACIDADE; }
}
