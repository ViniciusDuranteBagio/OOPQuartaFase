import java.util.ArrayList;

class Agenda {

    private final int LIMITE = 10;
    private ArrayList<Consulta> consultas = new ArrayList<>();

    public boolean adicionarConsulta(Consulta consulta) {
        if (consultas.size() >= LIMITE) {
            return false;
        }
        consultas.add(consulta);
        return true;
    }
    public String listarConsultas() {
        if (consultas.isEmpty()) return "Nenhuma Consulta Cadastrada.";

        StringBuilder sb = new StringBuilder("Consultas do dias:\n\n");
        for (int i = 0; i < consultas.size(); i++) {
            sb.append((i + 1) + " - " + consultas.get(i).toString() + "\n\n");
        }
        return sb.toString();
    }
}
