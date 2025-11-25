package TrabalhoFinal;

import java.util.ArrayList;
import java.util.List;

class Agenda {

    private List<Consulta> consultas = new ArrayList<>();

    public void adicionarConsulta(Consulta consulta) throws ValidacaoException {
        if (consultas.size() >= 10)
            throw new ValidacaoException("Agenda cheia! Máximo de 10 consultas por dia.");
        consultas.add(consulta);
    }

    public boolean temConsultas() {
        return !consultas.isEmpty();
    }

    public String listarConsultas() {
        if (consultas.isEmpty()) {
            return "Nenhuma consulta cadastrada ainda.";
        }
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Consulta c : consultas) {
            sb.append("Consulta ").append(i++).append(":\n").append(c).append("\n\n");
        }
        return sb.toString();
    }
}
