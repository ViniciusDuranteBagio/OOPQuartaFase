package TrabalhoFinal;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private final List<Consulta> consultas = new ArrayList<>();
    public static final int LIMITE = 10;

    public boolean adicionarConsulta(Consulta consulta) {
        if (consultas.size() >= LIMITE) {
            return false;
        }
        consultas.add(consulta);
        return true;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public boolean cheia() {
        return consultas.size() >= LIMITE;
    }
}
