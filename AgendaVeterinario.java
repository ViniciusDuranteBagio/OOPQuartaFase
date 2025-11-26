import java.util.ArrayList;

public class AgendaVeterinario {
    private ArrayList<Consulta> consultas;

    public AgendaVeterinario() {
        this.consultas = new ArrayList<>();
    }
    public ArrayList<Consulta> listaConsultas() {
        return this.consultas;
    }
    public void adicionarConsulta(Consulta consulta) throws ValidacaoException{
        if(consultas.size() >= 10){
            throw new ValidacaoException("Nao e possivel adicionar mais de 10 consultas na agenda");
        }
        consultas.add(consulta);
    }
}

