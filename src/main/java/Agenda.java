import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Consulta> consultas;
    private static final int MAX_CONSULTAS = 10;

    public Agenda() {
        this.consultas = new ArrayList<>();
    }

    public void adicionarConsulta(Consulta consulta) throws ValidacaoException {
        if (consultas.size() >= MAX_CONSULTAS) {
            throw new ValidacaoException("Agenda cheia po! Nao tem mais hora não, eu lá sou escravo pra trabalhar 24h por dia");
        }
        consultas.add(consulta);
    }

    public void listarConsultas() {
        if (consultas.isEmpty()) {
            System.out.println("Nenhuma consulta cadastrada kkkkkkkkk alguém ta com o nome mal falado na praça pelo jeito");
            System.out.println(); 
        } else {
            for (int i = 0; i < consultas.size(); i++) {
                System.out.println((i + 1) + ". " + consultas.get(i).toString());
            }
        }
    }

    public int getQuantidadeConsultas() {
        return consultas.size();
    }

    public boolean estaCheia() {
        return consultas.size() >= MAX_CONSULTAS;
    }
}

