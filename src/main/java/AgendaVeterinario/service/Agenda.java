package AgendaVeterinario.service;

import AgendaVeterinario.model.Consulta;
import AgendaVeterinario.exception.LimiteConsultaException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private LocalDate data = LocalDate.now();

    private List<Consulta> agendaVeterinario = new ArrayList<>();



    public void adicionarConsulta(Consulta consulta){

        LocalDate novaData = consulta.getData();
        int contador = 0;

        for (Consulta c : agendaVeterinario){
            if (c.getData().equals(novaData)){
                contador++;
            }
        }

        if (contador > 10){
            throw new LimiteConsultaException("Limite de apenas 10 consultas diária ultrapassado!");
        }

        agendaVeterinario.add(consulta);
    }

    public List<Consulta> getAgendaVeterinario() {
        return agendaVeterinario;
    }

}
