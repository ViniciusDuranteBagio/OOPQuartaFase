import java.util.ArrayList;

public class AgendaVeterinario {

    private ArrayList<Atendimento> atendimentos;
    private final int LIMITE = 10;

    public AgendaVeterinario() {
        atendimentos = new ArrayList<>();
    }

    public void adicionarAtendimento(Atendimento atendimento) throws AgendaCheiaException {
        if (atendimentos.size() >= LIMITE) {
            throw new AgendaCheiaException("A agenda está cheia. Limite máximo de 10 atendimentos.");
        }
        atendimentos.add(atendimento);
    }

    public boolean estaVazia() {
        return atendimentos.isEmpty();
    }

    public ArrayList<Atendimento> listarAtendimentos() {
        return atendimentos;
    }

    public String gerarHorario() {
        int hora = 8 + atendimentos.size();
        return hora + ":00";
    }
}
