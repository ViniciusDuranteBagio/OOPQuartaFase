package trabalhofinal;

import java.util.ArrayList;

public class AgendaConsultas {
    private ArrayList<Consulta> consultas;

    public AgendaConsultas() {
        this.consultas = new ArrayList<>();
    }

    public ArrayList<Consulta> listasDeConsultas() {
        return this.consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void adicionarConsulta(Consulta consulta) throws ValidacaoException{
        if(consultas.size() >= 10){
            throw new ValidacaoException("Agenda de hoje já atingiu o limite de 10 consultas no dia");
        }
        consultas.add(consulta);
    }

}
