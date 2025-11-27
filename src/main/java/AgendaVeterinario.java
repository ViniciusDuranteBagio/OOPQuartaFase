public class AgendaVeterinario {
    private static final int LIMITE_CONSULTAS = 10;
    private Consulta[] consultas;
    private int totalConsultas;

    public AgendaVeterinario() {
        this.consultas = new Consulta[LIMITE_CONSULTAS];
        this.totalConsultas = 0;
    }

    public void adicionarConsulta(Animal animal, TipoAtendimento tipo, String doenca)
            throws ValidacaoException {
        if (totalConsultas >= LIMITE_CONSULTAS) {
            throw new ValidacaoException(
                    "Agenda cheia! Não há mais horários disponíveis hoje."
            );
        }

        Consulta consulta;
        if (tipo == TipoAtendimento.CONSULTA && doenca != null) {
            consulta = new Consulta(totalConsultas + 1, animal, tipo, doenca);
        } else {
            consulta = new Consulta(totalConsultas + 1, animal, tipo);
        }

        consultas[totalConsultas] = consulta;
        totalConsultas++;
    }

    public String listarConsultas() {
        if (totalConsultas == 0) {
            return "Nenhuma consulta cadastrada ainda.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("========== CONSULTAS DO DIA ==========\n\n");

        for (int i = 0; i < totalConsultas; i++) {
            sb.append(consultas[i].toString());
            sb.append("\n").append("-".repeat(40)).append("\n");
        }

        sb.append("\nTotal: ").append(totalConsultas).append("/").append(LIMITE_CONSULTAS);

        return sb.toString();
    }

    public int getTotalConsultas() {
        return totalConsultas;
    }

    public boolean agendaCheia() {
        return totalConsultas >= LIMITE_CONSULTAS;
    }
}
