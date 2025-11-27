import javax.swing.JOptionPane;

public class Agenda {
    private Consulta[] consultas = new Consulta[10];
    private int total = 0;

    public void adicionar(Consulta c) {
        if (total == 10) {
            throw new ValidacaoException("A agenda já está cheia! Só amanhã mesmo ");
        }
        consultas[total] = c;
        total++;
    }

    public String listar() {
        if (total == 0) {
            return "Nenhuma consulta cadastrada ainda.";
        }

        StringBuilder sb = new StringBuilder("Consultas cadastradas:\n\n");
        for (int i = 0; i < total; i++) {
            sb.append((i + 1) + ". " + consultas[i] + "\n");
        }

        return sb.toString();
    }
}
