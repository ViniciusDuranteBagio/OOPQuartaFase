package trabalho_final;

public class Agenda {
    private Consulta[] consultas = new Consulta[10];
    private int total = 0;

    public void adicionarConsulta(Consulta c) throws ValidacaoException {
        if (total >= 10) {
            throw new ValidacaoException("trabalho_final.Agenda atingiu o limite de 10 consultas.");
        }
        consultas[total] = c;
        total++;
    }

    public void cancelarConsulta(String nomeAnimal) throws ValidacaoException {
        if (nomeAnimal == null || nomeAnimal.trim().isEmpty()) {
            throw new ValidacaoException("Nome inválido.");
        }

        for (int i = 0; i < total; i++) {
            if (consultas[i].getAnimal().getNome().equalsIgnoreCase(nomeAnimal.trim())) {

                for (int j = i; j < total - 1; j++) {
                    consultas[j] = consultas[j + 1];
                }

                consultas[total - 1] = null;
                total--;

                return;
            }
        }

        throw new ValidacaoException("Nenhuma consulta encontrada para esse animal.");
    }

    public String listarConsultas() {
        if (total == 0) {
            return "Nenhuma consulta cadastrada.";
        }

        StringBuilder sb = new StringBuilder("Consultas cadastradas:\n\n");

        for (int i = 0; i < total; i++) {
            Consulta c = consultas[i];

            sb.append((i + 1))
                    .append(" - ")
                    .append(c.getAnimal().getNome())
                    .append(" (").append(c.getAnimal().getClass().getSimpleName()).append(")")
                    .append(" | Idade: ").append(c.getAnimal().getIdade())
                    .append(" | trabalho_final.Atendimento: ").append(c.getAtendimento().getTipo())
                    .append(" | Data: ").append(c.getData());

            if (c.getDoenca() != null) {
                sb.append(" | Doença: ").append(c.getDoenca());
            }

            sb.append("\n");
        }

        return sb.toString();
    }
}
