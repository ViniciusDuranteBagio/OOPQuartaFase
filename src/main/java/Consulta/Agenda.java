package Consulta;

public class Agenda {

    private static final int CAPACIDADE_MAX = 10;
    private Agendamento[] agendamentos = new Agendamento[CAPACIDADE_MAX];
    private int total = 0;

    public boolean adicionar(Agendamento ag) {
        if (total >= CAPACIDADE_MAX) return false;
        agendamentos[total++] = ag; // adiciona e incrementa total
        return true;
    }

    public int tamanho() {
        return total;
    }

    public Agendamento[] listar() {
        // retorna uma cópia do array com apenas os agendamentos existentes
        Agendamento[] copia = new Agendamento[total];
        System.arraycopy(agendamentos, 0, copia, 0, total);
        return copia;
    }
}
