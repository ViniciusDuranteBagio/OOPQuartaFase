import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda {
    public static final int MAX_CONSULTAS = 10;
    private final List<Consulta> consultas = new ArrayList<>();

    public void adicionarConsulta(Consulta c) throws ValidacaoException {
        if (c == null) throw new ValidacaoException("Consulta inválida.");
        if (consultas.size() >= MAX_CONSULTAS) {
            throw new ValidacaoException("Agenda cheia. Não há mais horários disponíveis.");
        }
        consultas.add(c);
    }

    public List<Consulta> listarConsultas() {
        return Collections.unmodifiableList(consultas);
    }

    public int totalConsultas() {
        return consultas.size();
    }

    public void limpar() {
        consultas.clear();
    }

    public int tamanho() {
        return 0;
    }
}